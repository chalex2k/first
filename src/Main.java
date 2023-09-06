import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
      Используем только типы:
      int, double, boolean, char, String
     */

    public static double calcV(double r, double h) {
        // double s = Math.PI * Math.pow(r, 2);
        double s = Math.PI * r * r;
        double v = s * h;
        return v;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input r: ");
        double r = scanner.nextDouble();
        System.out.print("Input h: ");
        double h = scanner.nextDouble();

        double v = calcV(r, h);

        System.out.printf("V = %.02f%n", v);
    }
}