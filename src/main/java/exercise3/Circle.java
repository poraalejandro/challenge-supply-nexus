package main.java.exercise3;

public class Circle extends Figure {

    @Override
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
