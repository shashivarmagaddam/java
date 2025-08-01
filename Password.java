import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter your password:");
            password = sc.nextLine();

            if (password.equals("shashi")) {
                System.out.println("Access granted. Welcome!");
                break;
            } else {
                System.out.println("Password is incorrect.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Too many attempts. Please contact support.");
        }
    }
}
