package com.empproject.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	private Integer emp_id;
	private String emp_name;
	private String address;
	
	
	public Employee() 
	{
		super();
	}
	
	public Employee(Integer Emp_id, String Emp_name, String Address)
	{
		super();
		emp_id = Emp_id;
		emp_name = Emp_name;
		address = Address;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getemp_id() {
		return emp_id;
	}
	public void setemp_id(Integer Emp_id)
	{
		emp_id = Emp_id;
	}
	public String getemp_name()
	{
		return emp_name;
	}
	public void setemp_name(String Emp_name)
	{
		emp_name = Emp_name;
	}
	public String getaddress()
	{
		return address;
		
	}
	public void getaddress(String Address)
	{
		address = Address;
	}
	@Override
	public String toString()
	{
		return "Employee[Employee id:"+emp_id+" Employee name"+emp_name+" Employee Address"+address+"]";
	}
}

