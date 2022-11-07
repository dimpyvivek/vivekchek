import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class OperatorsProgram {

    public static void main(String[] args) {

        System.out.println("Using All Operator in this Programs ");
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the first Value ");
        a = input.nextInt();
        System.out.println("Enter the Second Value ");
        b = input.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);




    }

}
