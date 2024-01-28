package az.edu.turing.homework02;

import java.util.Scanner;

public class task5App {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();
        String season = month < 1 || month > 12
                ? "Wrong input!" : (month >= 3 && month <= 5)
                ? "Spring" : (month > 5 && month <= 8)
                ? "Summer" : (month > 8 && month <= 11)
                ? "Autumn" : "Winter";
        System.out.println(season);
    }
}
