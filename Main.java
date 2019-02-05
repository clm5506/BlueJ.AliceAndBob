/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner myScanner = new Scanner(System.in);
        String yourName;
        
        System.out.println("Please enter your name");
        yourName = myScanner.nextLine();
        
        if (yourName.equals("Alice")) {
            System.out.println("Hello there Alice");
        } else if (yourName.equals("Bob")) {
            System.out.println("Yo Bob");
        } else {
            System.out.println("You don't get a greeting");
        }
    }
}
