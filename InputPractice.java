import java.util.Scanner;

public class InputPractice {

    public static void main(String[] args) {

        System.out.println("Multiplication of two Input Numbers");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the First Value ");
        a = input.nextInt();
        System.out.println("Enter the Second Value ");
        b = input.nextInt();
        c = a*b;
        System.out.println(a + "x" + b + "= " + c );




    }
}
