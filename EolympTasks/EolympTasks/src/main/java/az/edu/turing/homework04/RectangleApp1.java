package az.edu.turing.homework04;


import java.util.Scanner;

public class RectangleApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
