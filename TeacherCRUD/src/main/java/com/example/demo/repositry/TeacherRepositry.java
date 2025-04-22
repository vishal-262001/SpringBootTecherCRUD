package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Teacher;
@Repository
public interface TeacherRepositry extends JpaRepository<Teacher,Integer> {

}
