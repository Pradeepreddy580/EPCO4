package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	
	@Value("30061")
	private int id;
	
	@Value("Pradeep")
	private String name;
	
	@Value("4000")
	private int salary;
	public Employee() {
		super();
		System.out.println("Employee bean created");
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printEmployees() {
		System.out.println("EMployee BEAN");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	
}
