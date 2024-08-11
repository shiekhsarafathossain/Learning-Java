package patternproblem2;

import java.util.Scanner;

public class PatternProblem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        System.out.print("Enter the size of M: ");
        num1 = sc.nextInt();
        System.out.print("Enter the size of N: ");
        num2 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
               if(i==0||j==0||i==num1-1||j==num2-1){
                   System.out.print("* ");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    
}
