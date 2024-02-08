package az.edu.turing.homework04;

import java.util.Scanner;

public class DollarsInBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long year=0;
        x=x+1;
        while (x>1){
            x=x/2;
            year++;
        }
        System.out.println(year-1);
    }
}
