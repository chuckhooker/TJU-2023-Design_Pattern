package Template_Method;

public class ClassifyByNaiveBayesAdapter implements ClassifyAdapter{
	
	AbstractClassify naiveBayes = new NaiveBayes();

	@Override
	public void classifyData() {
		naiveBayes.process();
		
	}

}
