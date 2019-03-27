package Tasks;

import java.util.Scanner;

public class Task2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two digits to find" +
                "the greatest common divisor:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int d = 0;
        int temp = 0;

        if (n1 < n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        for (d = n1;(n1 % d != 0 && n2 % d != 0); d--) {

        }
        System.out.println("The greatest divider of " +n1+
                " and "+n2+" is "+d);
    }

}
