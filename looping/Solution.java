package looping;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder(); // Used to collect all the formatted output

        output.append("================================\n");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next(); // Taking string input
            int x = sc.nextInt(); // Taking integer input

            // Append formatted string to StringBuilder
            output.append(String.format("%-15s%03d%n", s1, x));
        }

        output.append("================================");

        // Print the entire collected output at once
        System.out.print(output.toString());
    }
}
