package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    public ArrayList<Shape> shapes = new ArrayList <>();

    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
