package AbstractFactory.factory;


public abstract class Factory {
	
	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println(className + "can not be found.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Connection createConnection();
	public abstract Statement createStatement();

}
