// program to demonstrate method overloading

public class AreaCalculator {
    public static void main(String[] args) {
        // parameters will determine which method is called
        System.out.println(area(5.0, 2.0));
        System.out.println(area(5.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    } // end area()

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    } // end area()
}
