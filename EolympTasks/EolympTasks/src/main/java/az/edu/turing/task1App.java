package az.edu.turing;

import java.util.Scanner;

public class task1App {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int a;
        for (int i = 10; i > 0; i /= 10) {
            System.out.print(number / i +" ") ;
            number %= i;
        }

    }
}
