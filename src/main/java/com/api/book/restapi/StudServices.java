package com.api.book.restapi;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Service
public class StudServices {
    
   @Autowired
   StudentRepo studentRepo;

   public Student savestudent(Student student){
     return studentRepo.save(student) ;
   }

   public Iterable<Student> savestudnets(@RequestBody Iterable<Student> iterable){
      return (Iterable<Student>) studentRepo.saveAll(iterable);  
   }
   
   public Optional<Student> getStudent (Integer id){
      return studentRepo.findById(id);
   }

   public Student getStudentByName(String student){
     return studentRepo.findByName(student);
   }

   public Iterable<Student> getAllStudent(){
      return studentRepo.findAll();
   }

   public Student update(Student student){
        Student presentstud = studentRepo.findById(student.getId()).orElse(null);
         presentstud.setName(student.getName());
         presentstud.setClasss(student.getClasss());
         presentstud.setStream(student.getStream());
         studentRepo.save(presentstud);
       return presentstud;
   }

   public Student  DeleteByIDStudent(int id){
      Optional<Student> stud=studentRepo.findById(id);
      Student student=stud.get();
      studentRepo.deleteById(id);
      return student;
   }

}
