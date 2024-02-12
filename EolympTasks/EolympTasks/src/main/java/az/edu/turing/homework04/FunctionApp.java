package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();


        String quarter;
        if (n >= 1 && n <= 3) {
            quarter = "First";
        } else if (n >= 4 && n <= 6) {
            quarter = "Second";
        } else if (n >= 7 && n <= 9) {
            quarter = "Third";
        } else {
            quarter = "Fourth";
        }

        System.out.println(quarter);
    }

}

