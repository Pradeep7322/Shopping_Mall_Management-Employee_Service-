package com.empproject.demo;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Employee_Service_Controller 
{

	  @Autowired(required=true)
	  private Employee_Service service;
	  
	  @GetMapping("/employeeservice")
	  public java.util.List<Employee>list()
	  {
		  return service.listAll();
	  }
	  @GetMapping("/employeeservice/{Employee_Id}")
	  public ResponseEntity <Employee> get(@PathVariable Integer employee_Id)
	  {
		  try
		  {
			Employee employee = service.get(employee_Id);
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		  }
		  catch(NoResultException e)
		  {
			  return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		  }
	   
	  }
		  @PostMapping("/employeeservice")
		  public void add(@RequestBody Employee employee)
		  {
			  service.save(employee);
		  }
		  @PutMapping ("/employeeservice/{Employee_Id}")
		  public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer employee_Id)
		  {
			  Employee existEmployee = service.get(employee_Id);
			  service.save(existEmployee);
			  return new ResponseEntity<>(HttpStatus.OK);
		  }
		  @DeleteMapping("/employeeservice/{Employee_Id}")
		  public void delete (@PathVariable Integer admin_Id)
		  {
			  service.delete(admin_Id);
		  }

}
