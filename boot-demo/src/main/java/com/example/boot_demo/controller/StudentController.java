package com.example.boot_demo.controller;


import com.example.boot_demo.dao.Student;
import com.example.boot_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController is a commonly used annotation in the Spring framework, specifically designed for creating RESTful web APIs. It tells Spring:
//"This class is a controller that will handle HTTP requests and return data in JSON or other formats, instead of rendering a web page."

//RESTful style is a way of designing APIs by leveraging the capabilities of the HTTP protocol itself (using URL and HTTP methods). It makes APIs cleaner, more consistent in structure, and better suited for automated documentation and front-end/back-end collaboration.
public class StudentController {

    @Autowired
    private StudentService studentService;
    //@Autowired is an annotation in the Spring Framework used to perform dependency injection (DI).
    //It tells Spring:
    //"Please help me find a Bean of type StudentService and assign it to this variable."
    //private StudentService studentService; declares a private member variable that is used to receive the injected StudentService instance.

    @GetMapping("/student/{id}")
    //This annotation maps HTTP GET requests to the method below.
    //The URL path contains a variable part {id}, e.g. /student/123.
    public Student getStudentById(@PathVariable long id){
        //This method is named getStudentById.
        //The @PathVariable annotation binds the value from the URL to the id parameter.
        //For example, if the request is /student/123, then id will be 123.
        return studentService.getStudentById(id);
        //This line calls the getStudentById method from the studentService (business logic layer).
        //The result is returned as a Student object.
        //Spring automatically converts the returned object to JSON for the HTTP response.

    }


}
