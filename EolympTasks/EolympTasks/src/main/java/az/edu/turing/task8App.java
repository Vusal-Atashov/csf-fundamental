package az.edu.turing;

import java.util.Scanner;

public class task8App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a < b) {
            System.out.print(a + " " + b);
        } else if (a > b) {
            System.out.print(b + " " + a);
        }
    }
}
