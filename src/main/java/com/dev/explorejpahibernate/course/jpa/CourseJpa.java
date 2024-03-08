package com.dev.explorejpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.dev.explorejpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpa {
   //When we want jpa to talk to a DB we need a entity manager
   
   @PersistenceContext
   private EntityManager manager;

   public void insert(Course course){
    manager.merge(course);
   }

   public Course findById(long id){
    return manager.find(Course.class, id);
   }
   public void deleteById(long id){
    Course c=findById(id);
     manager.remove(c);
   }
}
