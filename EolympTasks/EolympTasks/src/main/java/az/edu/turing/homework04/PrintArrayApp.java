package az.edu.turing.homework04;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[]arr=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
    }
}
