package AbstractFactory.listfactory;

import AbstractFactory.factory.Connection;

public class MysqlConnection implements Connection{

	@Override
	public void doConnection() {
		System.out.println("Doing Mysql Connection");
		
	}

}
