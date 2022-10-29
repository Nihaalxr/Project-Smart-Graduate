import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter side of square:");
        Scanner Scanner = new Scanner(System.in);

        double side = Scanner.nextDouble();

        double area = side*side;
        System.out.println("Area of square is:"+area);
    }
}