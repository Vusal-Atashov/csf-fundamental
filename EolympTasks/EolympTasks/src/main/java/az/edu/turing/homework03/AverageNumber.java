package az.edu.turing.homework03;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number.nextInt();
        }
        int average;
           if ((arr[0] >= arr[1] && arr[0] <= arr[2]) || (arr[0] >= arr[2] && arr[0] <= arr[1])) {
              average=arr[0];
           } else if ((arr[1] >= arr[0] && arr[1] <= arr[2]) || (arr[1] >= arr[2] && arr[1] <= arr[0])) {
               average = arr[1];
           } else {
               average = arr[2];
           }
        System.out.println(average);
    }
}
