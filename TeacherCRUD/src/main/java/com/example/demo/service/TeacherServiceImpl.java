package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repositry.TeacherRepositry;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepositry repositry;

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		repositry.save(teacher);
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return repositry.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repositry.deleteById(id);

	}

	@Override
	public void update(Teacher teacher, Integer id) {
		// TODO Auto-generated method stub
		teacher.setId(id);
		repositry.save(teacher);

	}

	@Override
	public List<Teacher> search(String name) {
		// TODO Auto-generated method stub
		ArrayList<Teacher> array = new ArrayList<Teacher>();

		for (Teacher teacher : repositry.findAll()) {
			if (teacher.getName().equalsIgnoreCase(name))
				array.add(teacher);

		}
		return array;
	}

}
