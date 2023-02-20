package com.empproject.demo;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class Employee_Service {
	@Autowired
	private Employee_Service_Repository repo;
	
	   public List<Employee> listAll()
    {
  	  return repo.findAll();
    }
    
    public void save(Employee employee)
    {
  	  repo.save(employee);
    }
    
    public Employee get(Integer employee_Id)
    {
  	  return repo.findById(employee_Id).get();
    }
    
    public void delete(Integer employee_Id)
    {
  	  repo.deleteById(employee_Id);
    }


}
