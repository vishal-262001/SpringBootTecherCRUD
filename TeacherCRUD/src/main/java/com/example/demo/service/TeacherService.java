package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Teacher;


public interface TeacherService {

	public void add(Teacher teacher) ;
	
	public  List<Teacher> display();
	
	public void delete(Integer id);
	
	public void update (Teacher teacher,Integer id);
	
	public List<Teacher> search(String name);
}
