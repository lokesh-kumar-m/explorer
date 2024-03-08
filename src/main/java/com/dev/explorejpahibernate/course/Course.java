package com.dev.explorejpahibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    //Mapping the values with the column names in DB table
    
    //denoting primary Key
    @Id     
    private int id;
    //column with "name" in the DB table mapped with name valiable
    private String name;
    //column with "author" in the DB table mapped with author valiable

    private String author;

    public Course(){

    }

    public Course(int id,String name,String author){
        super();
        this.id=id;
        this.name=name;
        this.author=author;
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "The course id:"+id+", its name: "+name+" and author:"+author+"";
    }
}
