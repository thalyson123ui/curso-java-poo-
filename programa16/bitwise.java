package programa16;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mask = 0b00100000; // 6th bit mask
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is set");
        } else {
            System.out.println("6th bit is not set");
        }

        sc.close();
    }
}
