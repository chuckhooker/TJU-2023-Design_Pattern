package bridge;

public class Main {
	
	public static void main(String[] args) {
	
		Image image1 = new JPG(new Cutout());
		Image image2 = new GIF(new Sharpen());
		Image image3 = new BMP(new Texture());
		
		image1.addFilter();
		image2.addFilter();
		image3.addFilter();
	
	}

}
