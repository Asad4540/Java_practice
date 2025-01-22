package Array;

public class SimpleArray {
    public static void main(String[] args) {
        char[] a = new char[5];

        a[0] = 'a';
        a[1] = 's';
        a[2] = 'a';
        a[3] = 'd';
        a[4] = 'c';

        System.out.println(a);
        System.out.println("-----------");

        for (int j = 0; j < 5; j++) {
            System.out.println(a[j]);
        }

    }

}
