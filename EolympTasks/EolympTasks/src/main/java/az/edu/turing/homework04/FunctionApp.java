package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println((int)Math.pow(2,a)+(int)Math.pow(2,b));
    }

}

