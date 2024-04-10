package silver.v;

import java.util.Scanner;

public class Q12871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int value = t.contains(s) ? 1 : 0;
        System.out.println(value);
    }
}
