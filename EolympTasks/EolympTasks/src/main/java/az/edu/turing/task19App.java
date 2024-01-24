package az.edu.turing;

import java.util.Scanner;

public class task19App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean c=false;
        if (a>0&&b>00){
            c=true;
        } else if (a<0&&b<0) {
            c=true;
        }else c=false;
        if (c){
            System.out.println(1);
        }else System.out.println(0);
    }
}
