package az.edu.turing.homework03;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        int number=new Scanner(System.in).nextInt();
        int sumNumber=(number/10+number%10);
        System.out.println(sumNumber*sumNumber);
    }
}
