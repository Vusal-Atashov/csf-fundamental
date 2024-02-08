package az.edu.turing.homework04;

import java.util.Scanner;

public class DollarsInBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int dollar=1;
        int year=0;
        while (dollar!=x){
            dollar=dollar+dollar*2;
            year++;
        }
        System.out.println(year);
    }
}
