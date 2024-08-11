package patternproblem6;

import java.util.Scanner;

public class PatternProblem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the size: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
    }
    
}
