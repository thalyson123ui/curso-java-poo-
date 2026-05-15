package programa19;
import java.util.Scanner;
public class funcoessintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("the greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("the greatest number is: " + b);
        } else {
            System.out.println("the greatest number is: " + c);
        }
        
        sc.close();
}
    public static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
}