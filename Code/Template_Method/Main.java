package Template_Method;

public class Main {
	
	public static void main(String[] args) {
		ClassifyAdapter[] algorithms = {
	            new ClassifyByNaiveBayesAdapter(),
	            new ClassifyByDecisionTreeAdapter(),
	            new ClassifyByKNNAdapter()
	        };

	        for (ClassifyAdapter algorithm : algorithms) {
	            algorithm.classifyData();
	            System.out.println("");
	        }
	
	}

}
