package com.pattern.Creational.Prototype;

public class PrototypeImpl {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		
		Employee emp=new Employee();
		
		emp.loadData();
		
		
		Employee cloneEmp1=emp.clone();
		Employee cloneEmp2=emp.clone();
		
		cloneEmp1.getEmpList().add("Quentessa");
		cloneEmp2.getEmpList().remove("Megatrron");
		
		System.out.println(emp.getEmpList());
		System.out.println(cloneEmp1.getEmpList());
		System.out.println(cloneEmp2.getEmpList());
	}

}
