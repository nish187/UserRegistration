
import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner scanner = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Welcome to User Registation Program");
    }

    public static void main(String[] args) {
        welcome();
        while (true) {

            System.out.println("Enter 0 : Exit");
            System.out.println("Enter 1 : To validate First Name ");
            System.out.println("Enter 2 : To validate Last Name ");
            System.out.println("Enter 3 : To validate E-mail ");
            System.out.println("Enter 4 : To validate Mobile Number ");

            switch (scanner.nextInt()) {
                case 0:
                    System.exit(0);

                case 1:
                    UserRegistration.validFirstName();
                    break;

                case 2:
                    UserRegistration.validLastName();
                    break;

                case 3:
                    UserRegistration.validEmail();
                    break;

                case 4:
                    UserRegistration.validMobileNumber();
                    break;
            }
        }
    }
}