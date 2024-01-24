package AbstractFactory.listfactory;

import AbstractFactory.factory.Statement;

public class MysqlStatement implements Statement{

	@Override
	public void doStatement() {
		System.out.println("Doing Mysql Statement");
		
	}

}
