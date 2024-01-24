package interpreter;

public class Main {
	
    public static void main(String[] args) {
        Context context = new Context();
        String instruction = "COPY VIEW FROM srcDB TO desDB";

        String[] parts = instruction.split(" ");
        Expression expression = null;

        if (parts.length == 6) {
            if (parts[0].equals("COPY") && parts[1].equals("VIEW") && parts[2].equals("FROM") && parts[4].equals("TO")) {
                expression = new CopyViewExpression(parts[3], parts[5]);
            }
        } else if (parts.length == 7) {
            if (parts[0].equals("MOVETABLE") && parts[2].equals("FROM") && parts[4].equals("TO")) {
                expression = new MoveTableExpression(parts[1], parts[3], parts[6]);
            }
        }

        if (expression != null) {
            expression.interpret(context);
        } else {
            System.out.println("Invalid instruction");
        }
    }
}
