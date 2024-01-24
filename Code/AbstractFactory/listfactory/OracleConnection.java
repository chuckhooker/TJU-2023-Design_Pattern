package AbstractFactory.listfactory;

import AbstractFactory.factory.Connection;

public class OracleConnection implements Connection{

	@Override
	public void doConnection() {
		System.out.println("Doing Oracle Connection");
		
	}

}
