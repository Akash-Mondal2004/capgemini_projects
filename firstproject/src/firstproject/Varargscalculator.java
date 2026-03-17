package firstproject;

import java.util.Scanner;

public class Varargscalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt(); 

        while (true) {
            String operator = sc.next();

            if (operator.equals("=")) {
                break;
            }

            if (operator.equals("+")) {
                int num = sc.nextInt();
                sum = totalSum(sum, num);
            }
        }

        System.out.println("Total Sum = " + sum);
        sc.close();
    }

    public static int totalSum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }
}
