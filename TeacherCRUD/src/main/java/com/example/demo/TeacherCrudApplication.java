package com.example.demo;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.service.TeacherServiceImpl;

@SpringBootApplication
public class TeacherCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TeacherCrudApplication.class, args);

		TeacherService ts = context.getBean(TeacherServiceImpl.class);

//		ts.add(new Teacher(101, "Vishal", "Java", "Computer",50000));
//		ts.add(new Teacher(102, "Yogesh", "Python", "Computer",54000));
//		ts.add(new Teacher(103, "Adesh", "os", "IT",54000));
//		ts.add(new Teacher(104, "Ganesh", "SpringBoot", "Computer",52000));
//		ts.add(new Teacher(105, "Sidhuu", "Html", "It",50050));

//		ts.add(new Teacher(106, "Tushar", "Html", "It",50050));
//		System.out.println(ts.display());

		Scanner sc = new Scanner(System.in);

		String name;

		String subject;

		String department;

		float salary;

		while (true) {
			System.out.println("""
					1.Create
					2.Display
					3.Update
					4.Delete
					""");
			int ch = sc.nextInt();
			switch (ch) {
			case 1 -> {
				System.out.println("Enter Teachers Details :");
				System.out.println("Enter Teacher name :");
				name = sc.next();
				System.out.println("Enter Teacher Subject:");
				subject = sc.next();
				System.out.println("Enter Teacher Department :");
				department = sc.next();
				System.out.println("Enter Teacher Salary:");
				salary = sc.nextFloat();

				ts.add(new Teacher(name, subject, department, salary));
				;
			}
			case 2 -> {
				ts.display().forEach(System.out::println);
			}
			case 3 -> {
				System.out.println("Enter Teacher id :");
				int id = sc.nextInt();
				System.out.println("Enter Teacher name :");
				name = sc.next();
				System.out.println("Enter Teacher Subject:");
				subject = sc.next();
				System.out.println("Enter Teacher Department :");
				department = sc.next();
				System.out.println("Enter Teacher Salary:");
				salary = sc.nextFloat();

				ts.update(new Teacher(name, subject, department, salary), id);

			}
			case 4 -> {
				System.out.println("Enter Teacher id :");
				int id = sc.nextInt();
				ts.delete(id);
			}
			case 5 -> {
				System.out.println("Enter Teacher name :");
				name = sc.next();
				ts.search(name);
			}

			default -> throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}

	}

}
