import java.util.Scanner;
public class Rectangle {
    double side1;
    double side2;

    public double areCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введить довжину першої сторони прямокутника: ");
        double side1 = scanner.nextDouble();

        System.out.print("Введить довжину другої стороги прямокутника: ");
        double side2 = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        double area = rectangle.areCalculator(side1, side2);
        double perimetrCalculator = rectangle.perimeterCalculator(side1, side2);

        System.out.println("Площа прямокуткика: " + area);
        System.out.ptintln("Періметр прямокутника: " + perimeter);
    }
}
