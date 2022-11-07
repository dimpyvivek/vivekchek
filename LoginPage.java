import java.util.Scanner;

public class LoginPage {

    public static void main(String[] args) {

        System.out.println("Enter your UserName and Password to log in page ");
        String UserName, Password;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name " + " :  ");
        UserName = input.nextLine();
        System.out.println("Enter Your Password");
        Password = input.nextLine();

//        Checking the Condition of Password

       if(UserName.equals("Vishwankpandey@gmail.com") && (Password.equals("Vivek@123")))
        {
            System.out.println("Welcome on This Portal");
        }
        else
       {
           System.out.println("Please re-enter the Password for Login the page ");
       }



    }
}
