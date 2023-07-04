package com.api.book.restapi;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer> { 
       Student findByName(String name);
}
