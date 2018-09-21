package com.pattern.Creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInitilization {

	
	private static LazyInitilization instance;
	
	private LazyInitilization() {}
	
	
	
	

	
	
	public static LazyInitilization getInstance() // make it synchronized to maje thread safe
	{
		if(instance==null)
		{
			
			/*synchronized (LazyInitilization.class) { // double check locking
				instance=new LazyInitilization();
			}*/
			
			instance=new LazyInitilization();
		}
		return instance;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//below code uses reflection to destroy the object and create new
		
		EagarInitilization instanceOne=EagarInitilization.getInstance();
		EagarInitilization instanceTwo=null;
		Constructor[] constructors=EagarInitilization.class.getDeclaredConstructors();
		
		for (Constructor con : constructors)
		{
			con.setAccessible(true);
			instanceTwo=(EagarInitilization) con.newInstance();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
