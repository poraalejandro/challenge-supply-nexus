package main.java.exercise1;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        boolean exit = false;

        do {

            int option;

            Scanner scanner = new Scanner(System.in);

            System.out.println("\nChoose an option: ");

            System.out.println("\n1. Run application");
            System.out.println("0. Exit.");

            System.out.println("\nChoose a menu option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter a String to check if it is a palindrome: ");
                    scanner.nextLine();

                    String phrase = scanner.nextLine();

                    phrase = cleanText(phrase);
                    phrase.replace(" ", "");

                    if (phrase.equalsIgnoreCase(new StringBuilder(phrase).reverse().toString())) {
                        System.out.println("\nIt is a palindrome.");
                    } else {
                        System.out.println("\nIt is not a palindrome.");
                    }

                    break;
                case 0:
                    System.out.println("The program has finished.");
                    exit = true;

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