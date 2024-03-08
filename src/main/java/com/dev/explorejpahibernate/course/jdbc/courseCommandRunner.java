package com.dev.explorejpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.explorejpahibernate.course.Course;
import com.dev.explorejpahibernate.course.datajpa.CourseDataJpaRepo;

@Component
public class courseCommandRunner implements CommandLineRunner{

    @Autowired
    private CourseDataJpaRepo dataRepo;
    @Override
    public void run(String... args) throws Exception {
        dataRepo.save(new Course(1,"Java","28min"));
        dataRepo.save(new Course(2,"React","28min"));
        dataRepo.save(new Course(3,"Node","Assam"));
        System.out.println("null");
        System.out.println(dataRepo.findById(3l));
        dataRepo.save(new Course(4,"DB","Assam"));
        dataRepo.findById(4l);
        System.out.println(dataRepo.findById(1l));
        System.out.println(dataRepo.findAll());
        System.out.println(dataRepo.count());
        System.out.println(dataRepo.findByAuthor("Assam"));
    }
    
}
