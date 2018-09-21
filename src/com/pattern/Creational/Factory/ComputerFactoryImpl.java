package com.pattern.Creational.Factory;

public class ComputerFactoryImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractComputer Pc=ComputerFactory.getComputer("Pc","5 GB", "500 GB", "2Ghz");
		AbstractComputer Server=ComputerFactory.getComputer("Server","16 GB", "900 GB", "6.5Ghz");
		
		System.out.println(Pc);
		System.out.println(Server);
		
		
		//abstract factory Patterns implementation
		
		AbstractComputer AbastractPc=ComputerFactory.getAbstractComputer(new PcFactory("10 GB", "500 GB", "2Ghz"));
		AbstractComputer AbastractServer=ComputerFactory.getAbstractComputer(new ServerFactory("18 GB", "900 GB", "6.5Ghz"));
		System.out.println(AbastractPc);
		System.out.println(AbastractServer);
		
		
	}

}
