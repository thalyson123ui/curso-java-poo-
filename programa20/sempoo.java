package programa20;

import java.util.Locale;
import java.util.Scanner;

public class sempoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        triangle x,  y;
        x = new triangle();
        y = new triangle();

        System.out.println("enter the measures of the triangle");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area = Math.abs((x.a * (y.b - y.c) + x.b * (y.c - y.a) + x.c * (y.a - y.b)) / 2.0);
        System.out.printf("Area = %.4f%n", area);

        sc.close();
    }
}
