package interpreter;

public class Context {
	
    public void copyView(String srcDB, String desDB) {
        System.out.println("Doing the Copying views from " + srcDB + " to " + desDB);
    }

    public void moveTable(String tableName, String srcDB, String desDB) {
        System.out.println("Doing the Moving table " + tableName + " from " + srcDB + " to " + desDB);
    }


}
