package patternproblem8;

import java.util.Scanner;

public class PatternProblem8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the size: ");
        num = sc.nextInt();
        int count=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
    
}
