package com.dev.explorejpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dev.explorejpahibernate.course.Course;

@Repository
public class coursesTable {
    @Autowired
    private JdbcTemplate springJdbcTemplate; 

    public void insert(Course course){
        springJdbcTemplate.update("insert into course values(?,?,?)",course.getId(),course.getName(),course.getAuthor());
    }
    public void delete(long id){
        springJdbcTemplate.update("delete from course where id=?",id);
    }
    public Course getInfo(long id){
        return springJdbcTemplate.queryForObject("select * from course where id=?", new BeanPropertyRowMapper<>(Course.class),id);
    }
}
