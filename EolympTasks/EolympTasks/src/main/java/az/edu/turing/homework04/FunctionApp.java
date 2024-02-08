package az.edu.turing.homework04;

import java.util.Scanner;

public class FunctionApp
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        double x = con.nextDouble();
        double y = (x * x + 3 * x - 4) / (2 * x - 3)-(x + 2) / (x * x - 5 * x + 7);
        System.out.printf("%.3f",y);
    }
}

