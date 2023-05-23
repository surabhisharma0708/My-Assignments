package BasicDS;

import java.util.Scanner;

class Login
{
    String userId = "Ajay",password = "password";

    public String loginUser(String user, String pass) {

        if (user.equals(userId) && pass.equals(password)) {
            return "Yes";

        } else {
            return "No";
        }

    }

}
public class Assignment1Q6
{
    public static void main(String[] args)
    {
        Login obj = new Login();
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x != 4)
        {
            x++;
            System.out.println("Enter userId");
            String user = sc.next();
            System.out.println("Enter password");
            String pass = sc.next();
            if (x == 3) {
                System.out.println("You have entered wrong credentials 3 times\n Contact Admin");
                break;
            } else {
                if(obj.loginUser(user, pass).equals("Yes"))
                {
                    System.out.println("Welcome Ajay");
                    break;
                }
                else
                {
                    System.out.println("You have entered wrong credentials, please enter the right credentials");
                }

            }

        }
    }
}
