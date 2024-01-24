package AbstractFactory.listfactory;

import AbstractFactory.factory.Statement;

public class OracleStatement implements Statement{

	@Override
	public void doStatement() {
		System.out.println("Doing Oracle Statement");
		
	}

}
