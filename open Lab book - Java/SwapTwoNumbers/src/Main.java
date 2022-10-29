public class Main {
    public static void main(String[] args) {
        double first = 2.50f,
                second = 4.50;
        System.out.println("--Before swap--");
        System.out.println("First number="+first);
        System.out.println("Second number="+second);

        double temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("first number="+first);
        System.out.println("second number="+second);

    }
}