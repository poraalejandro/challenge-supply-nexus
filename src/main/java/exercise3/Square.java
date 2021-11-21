package main.java.exercise3;

public class Square extends Figure {
    protected double side;

    @Override
    public double perimeter(double side) {
        return side * 4;
    }

    @Override
    public double area(double side) {
        return side * side;
    }
}
