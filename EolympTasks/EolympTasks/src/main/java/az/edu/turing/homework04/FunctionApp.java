package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum+= (long) Math.pow(i,2);

        }
        System.out.println(sum);
    }

}

