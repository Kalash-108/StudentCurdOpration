package com.api.book.restapi;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudController{
    
    @Autowired
    StudServices services ;
    
    @PostMapping("/addstudent")
    public Student setStudent(@RequestBody Student student){
        return services.savestudent(student);
    }

    @PostMapping("/addstudents")
    public Iterable<Student> setStudents(@RequestBody Iterable<Student> studenIterable){
        return (Iterable<Student>) services.savestudnets(studenIterable);
    }

    @GetMapping("/getstudentById/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return services.getStudent(id);
    }

    @GetMapping("/getstudentByName/{Name}")
    public Student getStudentName(@PathVariable String student){
        return services.getStudentByName(student);
    }

    @GetMapping("/getAllStudent")
    public Iterable<Student> getAllStudent(){
         return services.getAllStudent();
    }

    @PutMapping("/Update")
    public Student updateStudent(@RequestBody Student student){
        return services.update(student);
    }

    @DeleteMapping("/delete/{Id}")
    public Student deleteById(@PathVariable int Id){
       return services.DeleteByIDStudent(Id);
    }
    
     
}