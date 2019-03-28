package Tasks;
import java.util.Scanner;
public class Task3 {
    public void run() {

        String txtA, txtB = "";
        System.out.println("Enter the text to palindrome check:");
        Scanner scanner = new Scanner(System.in);

        txtA = scanner.nextLine();


        int a =txtA.length();

        for(int i=a-1; i >= 0; i--) {
            txtB = txtB + txtA.charAt(i);
        }
        if (txtA.equalsIgnoreCase(txtB)) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("Not today, SATAN.");
        }

    }
}
