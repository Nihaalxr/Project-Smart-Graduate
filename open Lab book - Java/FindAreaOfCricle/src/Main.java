import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the redius:");

        double radius = Scanner.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("the area of cricle is:"+area);

        double circumference = Math.PI * 2* radius;
        System.out.println("the circumference of cricle is:"+circumference);
    }
}