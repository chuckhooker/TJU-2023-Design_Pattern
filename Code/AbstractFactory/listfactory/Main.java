package AbstractFactory.listfactory;

import AbstractFactory.factory.Connection;
import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Statement;

public class Main {
	
	public static void main(String[] args) {
		Factory factory1 = Factory.getFactory("AbstractFactory.listfactory.MysqlFactory");
		Factory factory2 = Factory.getFactory("AbstractFactory.listfactory.OracleFactory");
		Factory factory3 = Factory.getFactory("AbstractFactory.listfactory.OtherFactory");
		
		Connection connection = factory1.createConnection();
		Statement statement = factory2.createStatement();
		
		connection.doConnection();
		statement.doStatement();
	}

}
