import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Triangle triangle = new Triangle();
                Scanner scanner = new Scanner(System.in);
                System.out.println("введите стороны треугольника: ");
                triangle.a = scanner.nextDouble();
                triangle.b = scanner.nextDouble();
                triangle.c = scanner.nextDouble();
                double area = triangle.area();
                System.out.println("Площадь треугольника "+area+" cm");
            }
        }

