package com.dev.explorejpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.explorejpahibernate.course.Course;

@Component
public class jpaRunner implements CommandLineRunner {

    @Autowired
    private CourseJpa cjpa;
    @Override
    public void run(String... args) throws Exception {
        cjpa.insert(new Course(1,"Java","Ohno"));
        cjpa.insert(new Course(2,"Spring","ohmygaa"));
        cjpa.insert(new Course(3,"jpa","hello"));
        cjpa.insert(new Course(4,"jdbc","Fine"));
        System.out.println(cjpa.findById(3));
        cjpa.insert(new Course(5,"boot","Sanqu"));
        cjpa.deleteById(5);
        cjpa.deleteById(4);
        System.out.println(cjpa.findById(1));
        cjpa.deleteById(3);
        cjpa.deleteById(2);
        cjpa.deleteById(1);
    }
    
}
