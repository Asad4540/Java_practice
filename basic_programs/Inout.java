package basic_programs;

import java.util.Scanner;

public class Inout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you string");
        String myString = scan.next();
        System.out.println("Enter you No");
        int myInt = scan.nextInt();
        scan.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
        }
    }

