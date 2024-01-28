package az.edu.turing.homework02;

import java.util.Scanner;

public class task10App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<0){
            System.out.println("Negative\n");
        } else if (a>0) {
            System.out.println("Positive\n");
        }else System.out.println("Zero\n");
    }
}
