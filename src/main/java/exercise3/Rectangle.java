package main.java.exercise3;

public class Rectangle extends Figure {

    @Override
    public double area(double width, double height) {
        return width * height;
    }

    @Override
    public double perimeter(double width, double height) {
        return 2 * (width + height);
    }
}
