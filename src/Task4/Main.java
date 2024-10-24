package Task4;

public class Main {
    public static void main(String[] args) {
        ShapeBuilder sb = new ShapeBuilder();
        sb.addShape(new Circle(5));
        sb.addShape(new Square(5));

        System.out.println(sb.getTotalArea());
    }
}
