import java.util.Scanner;

public class PAGUD_PROBLEM11 {

    static double toCelsius(char scale, double value) {
        if (scale == 'f') return (value - 32) * 5 / 9;
        if (scale == 'k') return value - 273.15;
        return value;
    }

    static double toFahrenheit(char scale, double value) {
        if (scale == 'c') return value * 9 / 5 + 32;
        if (scale == 'k') return (value - 273.15) * 9 / 5 + 32;
        return value;
    }

    static double toKelvin(char scale, double value) {
        if (scale == 'c') return value + 273.15;
        if (scale == 'f') return (value - 32) * 5 / 9 + 273.15;
        return value;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start scale by entering [c,f,k]: ");
        char scale = sc.next().charAt(0);

        System.out.print("Target scale [c,f,k]: ");
        char target = sc.next().charAt(0);

        System.out.print("Target value: ");
        double value = sc.nextDouble();

        double result;

        if (target == 'c')
            result = toCelsius(scale, value);
        else if (target == 'f')
            result = toFahrenheit(scale, value);
        else
            result = toKelvin(scale, value);

        System.out.printf("Result: %.2f %s", result, Character.toUpperCase(target));
    }
}