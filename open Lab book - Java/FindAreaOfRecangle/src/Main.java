import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the length of recangle:");
        double length = Scanner.nextDouble();

        System.out.println("Enter the width of recangle:");
        double width = Scanner.nextDouble();

        double area = length*width;
        System.out.println("Area of Recanglr is:"+area);
    }
}