package reversednumber;

import java.util.Scanner;

public class ReversedNumber {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        num = sc.nextInt();
        System.out.print(num+" reversed is ");
        while(num>0){
            int rem = num%10;
            System.out.print(rem);
            num = num/10;
        }
        System.out.println("");
    }
    
 
    
}
