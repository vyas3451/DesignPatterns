package com.pattern.Creational.Singleton;

public class EagarInitilization {

	
	private static final EagarInitilization instance=new EagarInitilization();
	
	private EagarInitilization()
	{}
	
	public static EagarInitilization getInstance()
	{
		return instance;
	}
	
	
}
