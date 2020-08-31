/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 8/29/2020
 *   Time: 6:34 PM
 *   File: MinElement.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int[] thisArray = myArray(5);
        printArray(thisArray);
        int min = minElement(thisArray);
        System.out.println(min);

    }

    public static int[] myArray(int number) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            temp = scanner.nextInt();
            array[i] = temp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]==" + array[i]);
        }
    }

    public static int minElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }

        }
        return min;
    }
}