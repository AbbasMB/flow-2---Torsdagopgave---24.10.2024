package Task4;

public class Square implements Shape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return lenght*lenght;
    }
}
