import java.util.Scanner;

public class Classforio {
    public static float[] takeip()
    {
        System.out.println("Welcome to Calculator application.");
        float[] arr=new float[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first operand");
        arr[0]=sc.nextFloat();
        System.out.println("Enter the second operand");
        arr[1]=sc.nextFloat();
        System.out.println("Choose any one operation");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        arr[2]=sc.nextFloat();

        return arr;
    }
    public static void printop(String s1)
    {
        System.out.println(s1);
    }
}