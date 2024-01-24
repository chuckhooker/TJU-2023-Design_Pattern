package AbstractFactory.listfactory;

import AbstractFactory.factory.Connection;
import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Statement;

public class MysqlFactory extends Factory{

	@Override
	public Connection createConnection() {
		return new MysqlConnection();
	}

	@Override
	public Statement createStatement() {
		return new MysqlStatement();
	}

}
