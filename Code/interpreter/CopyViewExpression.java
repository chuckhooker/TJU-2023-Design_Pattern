package interpreter;

class CopyViewExpression implements Expression {
    private String srcDB;
    private String desDB;

    public CopyViewExpression(String srcDB, String desDB) {
        this.srcDB = srcDB;
        this.desDB = desDB;
    }

    @Override
    public void interpret(Context context) {
        context.copyView(srcDB, desDB);
    }
}