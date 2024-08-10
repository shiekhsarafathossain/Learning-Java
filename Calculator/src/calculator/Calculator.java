package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            char operator;
            System.out.println("Choose a operator or press 0 to exit");
            System.out.println("+ || - || * || / || %");
            operator = sc.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '0') {
                if (operator == '0') {
                    System.out.println("Exiting...");
                    return;
                }
                
                int num1, num2;
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                if (operator == '-') {
                    System.out.println(num1 - num2);
                } else if (operator == '*') {
                    System.out.println(num1 - num2);
                } else if (operator == '/') {
                    System.out.println(num1 - num2);
                } else if (operator == '%') {
                    System.out.println(num1 % num2);
                } else if (operator == '+') {
                    System.out.println(num1 + num2);
                }
            } else {
                System.out.println("Enter a valid operator!!!");
            }
        }
    }

}
