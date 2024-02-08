package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        long k = con.nextInt();
        long sum = 0;
        long n = 1;
        while (true) {
            sum += n;
            if (sum % k == 0) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}

