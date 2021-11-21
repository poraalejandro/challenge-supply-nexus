package main.java.exercise3;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        boolean exit = false;

        do {

            int option;

            Scanner scanner = new Scanner(System.in);

            System.out.println("\nChoose an option: ");

            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("0. Exit.");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Circle circle = new Circle();

                    System.out.println("Introduce the radius of your circle:");

                    double radius = scanner.nextDouble();
                    double circleArea = circle.area(radius);
                    double circlePrimeter = circle.perimeter(radius);

                    System.out.println("The area of your circle is: " + circleArea);
                    System.out.println("The perimeter of your circle is: " + circlePrimeter);
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();

                    System.out.println("Introduce the width of your rectangle:");
                    double width = scanner.nextDouble();
                    System.out.println("Introduce the height of your rectangle:");
                    double height = scanner.nextDouble();
                    double rectangleArea = rectangle.area(width, height);
                    double rectanglePerimeter = rectangle.perimeter(width, height);

                    System.out.println("The area of your rectangle is: " + rectangleArea);
                    System.out.println("The perimeter of your rectangle is: " + rectanglePerimeter);

                    break;
                case 3:
                    Square square = new Square();

                    System.out.println("Introduce the side's length of your square:");
                    double side = scanner.nextDouble();
                    double squareArea = square.area(side);
                    double squarePerimeter = square.perimeter(side);

                    System.out.println("The area of your square is: " + squareArea);
                    System.out.println("The perimeter of your square is: " + squarePerimeter);
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
        } while (!exit);

    }

    public static String cleanText(String text) {
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        return text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

}