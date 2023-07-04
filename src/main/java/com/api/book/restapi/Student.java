package com.api.book.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String classs;
    private String stream ;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", classs=" + classs + ", stream=" + stream + "]";
    }

    public Student(int id, String name, String classs, String stream) {
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.stream = stream;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasss() {
        return classs;
    }
    public void setClasss(String classs) {
        this.classs = classs;
    }
    public String getStream() {
        return stream;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
}
