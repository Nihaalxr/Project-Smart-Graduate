import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int[]array=new int[10];
        int sum=0;
        System.out.print("sum of array element is:");
        for(int i=0;i<10;i++)
        {
            array[i]= Scanner.nextInt();
        }
        for (int num:array)
        {
            sum=sum+num;
        }
        System.out.println("1" +
                "sum of array elements is:"+sum);
    }
}