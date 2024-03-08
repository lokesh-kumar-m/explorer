package com.dev.explorejpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.explorejpahibernate.course.Course;

@Component
public class courseCommandRunner implements CommandLineRunner{

    @Autowired
    private coursesTable dataRepo;
    @Override
    public void run(String... args) throws Exception {
        dataRepo.insert(new Course(1,"Java","28min"));
        dataRepo.insert(new Course(2,"React","online"));
        dataRepo.insert(new Course(3,"Node","Assam"));
        System.out.println(dataRepo.getInfo(3));
        dataRepo.insert(new Course(4,"DB","Assaam"));
        dataRepo.delete(3);
        System.out.println(dataRepo.getInfo(1));
    }
    
}
