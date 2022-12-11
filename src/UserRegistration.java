import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static final Scanner scanner = new Scanner(System.in);


    public static void validFirstName() {

        System.out.println("Enter First Name :");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();

        if (r)
            System.out.println("It Is A Valid First Name");
        else
            System.out.println("It Is Invalid First Name");

    }
    public static void validLastName() {

        System.out.println("Enter Last Name:");
        String lname = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lname);
        boolean r = m.matches();

        if (r)
            System.out.println("It Is A Valid Last Name");
        else
            System.out.println("It Is Invalid Last name");

    }
    public static void validEmail() {

        System.out.println("Enter E-mail:");
        String email = scanner.next();
        //String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        String regex = "^[a-z]{3}[a-zA-Z.]{0,}+@+bl.co+[a-z.]{0,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();

        if (r)
            System.out.println("Valid Email Address");
        else
            System.out.println("Email Address is Invalid");

    }
    public static void validMobileNumber() {

        System.out.print("Enter your Mobile Number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[0-9]{2}(\s){1}[6-9]{1}[0-9]{9}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone Number is Valid");
        else
            System.out.println("Phone Number is Invalid");
    }
    public static void validPassRule1() {
        System.out.print("Enter The Password Atleast Eight Character : ");
        String passWord = scanner.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(passWord);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    public static void validPassRule2() {
        System.out.print("Enter the Password Atleast One Upper Case & Eight Character :");
        String passWord = scanner.nextLine();
        String regex4 = "^[A-Z a-z]{1}[A-Z a-z 0-9]{7,}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(passWord);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    public static void validPassRule3() {
        System.out.println("Enter the Password Atleast One Upper Case & One Numaric");
        String passWord2 = scanner.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(passWord2);
        boolean r6 = m6.matches();
        if (r6)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }

}