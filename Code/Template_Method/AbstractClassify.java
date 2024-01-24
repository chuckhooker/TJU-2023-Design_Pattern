package Template_Method;

public abstract class AbstractClassify {

	public final void process() {
		retrieveData();
		convertDataFormats();
		dataClassificationAlgorithms();
		displayResult();
	}
	
	public void retrieveData() {
		System.out.println("Data have been retrieved");
	}
	
	public void convertDataFormats() {
		System.out.println("The Format of Data have been converted");
	}
	
	public abstract void dataClassificationAlgorithms();
	
	public void displayResult() {
		System.out.println("Displaying the result");
	}

}
