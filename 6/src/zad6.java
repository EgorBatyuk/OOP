import java.util.Scanner;

public class zad6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Значение 1-го угла: ");
        int angle1 = scanner.nextInt();

        System.out.print("Значение 2-го угла: ");
        int angle2 = scanner.nextInt();

        int angle3 = 180 - (angle1 + angle2);

        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Ошибочные данные");
        }

        if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println("Треугольник остроугольный");
        }
        else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("Треугольник прямоугольный");
        }
        else {
            System.out.println("Треугольник тупоугольный");
        }

        if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            System.out.println("Треугольник равнобедренный");
        }

        if (angle1 == angle2 && angle2 == angle3 && angle1 == angle3) {
            System.out.println("Треугольник равносторонний");
        }
    }
}
