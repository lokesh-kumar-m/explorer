package com.dev.explorejpahibernate.course.datajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.explorejpahibernate.course.Course;

public interface CourseDataJpaRepo extends JpaRepository<Course,Long>{
    //This is custom methos to find the records that matches the given author name
    //It is easy to implement custom methods, the syntax is "findBy" followed by column name
    List<Course> findByAuthor(String author); 
}

/*
 * Jpa is an Api, It defines the specification
 * It lets you define entitites using @Entity
 * It lets you define attribute useing @Column(name="")
 * It manages the entities using entitymanager 
 * Hibernate is one of the most popular implementation of jpa
 */

