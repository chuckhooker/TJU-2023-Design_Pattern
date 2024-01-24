package Template_Method;

public class ClassifyByDecisionTreeAdapter implements ClassifyAdapter{
	
	AbstractClassify decisionTree = new DecisionTree();
	
	@Override
	public void classifyData() {
		decisionTree.process();
		
	}

}
