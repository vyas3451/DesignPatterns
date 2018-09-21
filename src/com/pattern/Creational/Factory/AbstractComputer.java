package com.pattern.Creational.Factory;

public abstract class AbstractComputer {

	
	public  abstract String getRam();
	public abstract String getHdd();
	public abstract String getCpu();
	@Override
	public String toString() {
		return "AbstractComputer [getRam()=" + getRam() + ", getHdd()=" + getHdd() + ", getCpu()=" + getCpu() + "]";
	}
	
	
	
}
