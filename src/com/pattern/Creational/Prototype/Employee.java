package com.pattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	private List<String> empList;
	
	
	public Employee()
	{
		empList=new ArrayList<String>();
	}
	public Employee(List<String> empList)
	{
		this.empList=empList;
	}
	
	public List<String> getEmpList()
	
	{
		return empList;
	}
	public void loadData()
	{
		empList.add("Optimus");
		empList.add("Prime");
		empList.add("Cybertron");
		empList.add("Megatrron");
		empList.add("Bumblebee");
	}
	
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> clonedEmpList=new ArrayList<String>();
		for(String emp:empList)
			clonedEmpList.add(emp);
		return new Employee(clonedEmpList);
		
		
	}
}
