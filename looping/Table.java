package looping;
import java.util.Scanner;

public class Table {
    public static void main(String [] args){
        System.out.println("=================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no to print table :");
       

        int n = scan.nextInt();
        System.out.println("=================================");
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
        System.out.println("============================");

    }    
}
