package az.edu.turing;

import java.util.Scanner;

public class task14App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a%b==0){
            System.out.println("Divisible\n");
        }else {
            System.out.println(a/b+" "+a%b);
        }
    }
}
