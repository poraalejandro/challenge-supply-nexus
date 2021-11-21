package main.java.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {

            if (!isArmstrong(i)) {
                continue;
            }

            System.out.println(i);
        }
    }

    static boolean isArmstrong(int number) {
        final int base10 = 10;
        int n = number;
        int addition = 0;
        int digit = 0;

        while (n > 0) {
            digit = n % base10;
            addition += digit * digit * digit;
            n /= base10;
        }

        return addition == number;
    }
}