public class TriangleTesting {
    static void main() {

        System.out.println("Testing validity:");
        System.out.println(TriangleUtils.isValid(3, 4, 5));
        System.out.println(TriangleUtils.isValid(1, 1, 3));
        System.out.println(TriangleUtils.isValid(-1, 2, 2));

        System.out.println("\nPerimeter tests:");
        System.out.println(TriangleUtils.perimeter(3, 4, 5));
        System.out.println(TriangleUtils.perimeter(1, 1, 3));

        System.out.println("\nArea tests:");
        System.out.printf("Area of 3-4-5 triangle: %.2f \n", TriangleUtils.area(3, 4, 5));
        System.out.printf("Area of equilateral (side 2): %.2f \n", TriangleUtils.area(2, 2, 2));

        System.out.println("\nAngle tests:");
        System.out.printf("Angle opposite side 3 (in 3-4-5): %.2f° \n", TriangleUtils.angleA(3, 4, 5));
        System.out.printf("Angle opposite side 5 (in 3-4-5): %.2f° \n", TriangleUtils.angleA(5, 4, 3));
    }
}

class TriangleUtils {

    private TriangleUtils() {
    }

    public static boolean isValid(double a, double b, double c) {

        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    public static double perimeter(double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1;
        }
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1.0;
        }

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double angleA(double a, double b, double c) {
        if (!isValid(a, b, c)) {
            return -1.0;
        }

        double denominator = 2 * b * c;
        if (denominator == 0) {
            return -1.0;
        }

        double cosA = (b * b + c * c - a * a) / denominator;
        if (cosA > 1) {
            cosA = 1;
        } else if (cosA < -1) {
            cosA = -1;
        }

        return Math.toDegrees(Math.acos(cosA));
    }
}