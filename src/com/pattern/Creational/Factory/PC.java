package com.pattern.Creational.Factory;

public class PC extends AbstractComputer{

	private String ram;
	private String Hdd;
	private String Cpu;
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.Hdd = hdd;
		this.Cpu = cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return Hdd;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return Cpu;
	}
	

}
