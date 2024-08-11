package patternproblem9;

import java.util.Scanner;

public class PatternProblem9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the size: ");
        num = sc.nextInt();
        int count=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    
}
