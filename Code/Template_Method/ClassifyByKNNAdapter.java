package Template_Method;

public class ClassifyByKNNAdapter implements ClassifyAdapter{
	
	AbstractClassify knn= new KNN();
	
	@Override
	public void classifyData() {
		knn.process();
		
	}

}
