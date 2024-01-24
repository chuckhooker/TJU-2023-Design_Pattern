package AbstractFactory.listfactory;

import AbstractFactory.factory.Connection;
import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Statement;

public class OracleFactory extends Factory{

	@Override
	public Connection createConnection() {
		return new OracleConnection();
	}

	@Override
	public Statement createStatement() {
		return new OracleStatement();
	}

}
