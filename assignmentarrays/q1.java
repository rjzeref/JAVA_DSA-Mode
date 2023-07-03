

import java.util.*;

public class q1 {
    static int area(int w, int b) {
        return w * b;
    }

    static long area(int r) {
        return r * r;
    }

    static double area(double l, int h) {
        return (double) 1 / 2 * l * h;
    }

    public static void main(String args[]) {
        System.out.println("Area of square is : " + area(2));
        System.out.println("Area of square is : " + area(3, 4));
        System.out.println("Area of square is : " + area(2.34, 7));
    }

}
