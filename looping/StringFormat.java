package looping;

import java.util.Scanner;

public class StringFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your string :");
            String s1 = sc.next();
            System.out.println("Enter your int :");
            int x = sc.nextInt();
            // Complete this line
            System.out.println(String.format("%-15s%03d", s1, x));

        }
        System.out.println("================================");

    }
}
