
//Find a table to input any Number

import java.awt.*;
import java.util.Scanner;

public class TableOfAnyNumbers {

    public static void main(String[] args) {

        System.out.println("Enter any value to find the table ");

        int table;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any value to Find the table Series is ");
        table = input.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.print(table + " " + "*" +  " " + i + " " + "is" + " = ");
            int table1 = table*i;
            System.out.println(table1);
        }



    }
}
