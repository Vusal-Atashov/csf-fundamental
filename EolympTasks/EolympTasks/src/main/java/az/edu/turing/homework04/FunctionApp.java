package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++) {

                System.out.print((long) Math.pow(i, 2)+" ");

        }


        scanner.close();
    }

}

