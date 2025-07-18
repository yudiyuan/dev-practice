package com.example.boot_demo.service;

import com.example.boot_demo.converter.StudentConverter;
import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dao.StudentRepository;
import com.example.boot_demo.dto.StudentDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    //A Spring annotation that tells the framework to automatically inject the corresponding Bean here.
    private StudentRepository studentRepository;
    //Declares a private field whose type is the StudentRepository interface.
    //The field name (variable name); you can use it in this class to access database logic without manually creating an object with new.

    @Override
//    public Student getStudentById(long id) {
//        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
//    }
    public StudentDTO getStudentById(long id){
        Student student=studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConverter.converterStudent(student);
    }

    @Override
    public Long addNewStudent(StudentDTO studentDTO) {
        List<Student> studentList=studentRepository.findByEmail(studentDTO.getEmail());
        if(!CollectionUtils.isEmpty(studentList)){
            throw new IllegalStateException("email:"+studentDTO.getEmail()+" has been taken");
        }

        Student student=studentRepository.save(StudentConverter.converterStudent(studentDTO));
        return student.getId();
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("id +"+id+" doesn't exist"));
        studentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public StudentDTO updateStudentById(long id, String name, String email) {

        Student studentInDB=studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("id +"+id+" doesn't exist"));

        if(StringUtils.hasLength(name) && !studentInDB.getName().equals(name)){
            studentInDB.setName(name);
        }
        if(StringUtils.hasLength(email) && !studentInDB.getEmail().equals(email)){
            studentInDB.setEmail(email);
        }

        Student student=studentRepository.save(studentInDB);
        return StudentConverter.converterStudent(student);
    }
}
