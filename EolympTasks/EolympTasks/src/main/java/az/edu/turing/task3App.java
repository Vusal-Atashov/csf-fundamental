package az.edu.turing;

import java.util.Scanner;

public class task3App {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int firsNumber, lastNumber;
        firsNumber = number / 100;
        lastNumber = number % 10;
        if (firsNumber < lastNumber) {
            System.out.println(lastNumber);
        } else if (firsNumber > lastNumber) {
            System.out.println(firsNumber);
        } else System.out.println("=");
    }
}
