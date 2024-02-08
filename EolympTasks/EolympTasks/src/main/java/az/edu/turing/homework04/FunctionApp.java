package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        double x = con.nextDouble();
        double y =Math.pow(x,3)-((5*Math.pow(x,2))/7)+(9*x)-(3/x)+1;
        System.out.printf("%.3f",y);
        con.close();
    }
}

