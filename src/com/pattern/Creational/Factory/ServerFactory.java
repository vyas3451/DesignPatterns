package com.pattern.Creational.Factory;

public class ServerFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;
	
	
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public AbstractComputer createComputer() {
		// TODO Auto-generated method stub
		return new Server(ram, hdd, cpu);
	}
}
