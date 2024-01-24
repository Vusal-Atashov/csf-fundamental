package az.edu.turing;

import java.util.Scanner;

public class task6App {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int firsNumber, lastNumber;
        firsNumber = number / 1000;
        lastNumber = number % 10;
        System.out.println(firsNumber+lastNumber);
    }
}
