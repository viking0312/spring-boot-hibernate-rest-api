package com.maulik.spring.boot.springrestapiapp.dao;

import java.util.List;

import com.maulik.spring.boot.springrestapiapp.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
