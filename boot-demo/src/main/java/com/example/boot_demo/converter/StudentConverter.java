package com.example.boot_demo.converter;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;

public class StudentConverter {

   public static StudentDTO converterStudent(Student student){
       StudentDTO studentDTO=new StudentDTO();
       studentDTO.setId(student.getId());
       studentDTO.setName(student.getName());
       studentDTO.setEmail(student.getEmail());
       return studentDTO;
   }


}
