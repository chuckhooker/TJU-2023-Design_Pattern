package interpreter;

class MoveTableExpression implements Expression {
    private String tableName;
    private String srcDB;
    private String desDB;

    public MoveTableExpression(String tableName, String srcDB, String desDB) {
        this.tableName = tableName;
        this.srcDB = srcDB;
        this.desDB = desDB;
    }

    @Override
    public void interpret(Context context) {
        context.moveTable(tableName, srcDB, desDB);
    }
}