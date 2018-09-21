package com.pattern.Creational.Factory;

public class ComputerFactory {

	public static AbstractComputer getComputer(String type,String ram,String Hdd,String Cpu)
	{
		if("Pc".equalsIgnoreCase(type)) return new PC(ram, Hdd, Cpu);
		if("Server".equalsIgnoreCase(type)) return new Server(ram, Hdd, Cpu);
		
		return null;
	}
	
	
	//implementation of AbstractFactoryPattern
	
	public static AbstractComputer getAbstractComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}
	
	
}
