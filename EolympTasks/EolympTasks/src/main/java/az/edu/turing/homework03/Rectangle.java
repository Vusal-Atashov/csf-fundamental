package az.edu.turing.homework03;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int num=1;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
