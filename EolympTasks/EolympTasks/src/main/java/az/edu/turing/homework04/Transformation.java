package az.edu.turing.homework04;

import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=0;
        while (a>1){
            if (a%2==0){
                a=a/2;
                b++;
            }else if(a%2==1) {
                a=a+1;
                b++;
            }
        }
        System.out.println(b);
    }
}
