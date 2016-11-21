import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        rectangle.setWidth(w);
        System.out.print("Enter height of rectangle: ");
        double h = sc.nextDouble();
        rectangle.setHeight(h);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
