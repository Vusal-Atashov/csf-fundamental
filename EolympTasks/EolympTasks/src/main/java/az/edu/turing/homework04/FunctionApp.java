package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        int x = con.nextInt();
        int y=con.nextInt();
        System.out.print((int)Math.pow(x,y));
    }
}

