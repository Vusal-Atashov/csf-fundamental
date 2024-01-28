package az.edu.turing.homework02;

import java.util.Scanner;

public class task2App {
    public static void main(String[] args) {
        int level = new Scanner(System.in).nextInt();
        if (level >= 1 && level <= 3) {
            System.out.println("Initial");
        } else if (level <= 6) {
            System.out.println("Average");
        } else if (level <= 9) {
            System.out.println("Sufficient");
        } else if (level <= 12) {
            System.out.println("High");
        }
    }
}
