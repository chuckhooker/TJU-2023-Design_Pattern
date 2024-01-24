package SimpleFactory;

public class DrawingTool {
	
	public Shape createShape(String shapeType) throws UnsupportedShapeException {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("Unsupported shape: " + shapeType);
        }
    }

}
