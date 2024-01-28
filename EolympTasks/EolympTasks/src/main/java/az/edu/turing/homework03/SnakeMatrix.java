package az.edu.turing.homework03;

import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

;
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num;
                    num++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num;
                    num++;
                }
            }
        }
        for (int[] element : matrix) {
            for (int i : element) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
