package Tasks;

import java.util.Scanner;

public class Task1 {
    public void run() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        //Fibonacci starting from t1 (0 or 1)
        int t1 = 1;
        int t2 = 1;

        for (int i=1; i < n; ++i) {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
        System.out.println("Fib  ("+n+") "+ t1);

    }



}

