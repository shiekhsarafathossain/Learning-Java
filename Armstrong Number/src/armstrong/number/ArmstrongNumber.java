package armstrong.number;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        int num,num2;
        int count = 0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        num2 = num;
        
        while(num>0){
            int rem = num%10;
            num = num/10;
            count++;
        }
        
        if(num2 == armStrong(num2,count)){
            System.out.println(num2+" is a Armstrong Number");
        }
        else{
            System.out.println(num2+" is not a Armstrong Number");
        }
        
    }
    
    public static int armStrong(int num2,int count){
        int sum=0;
        while(num2>0) {
            int rem = num2%10;
            sum += Math.pow(rem, count);
            num2 = num2/10;
        }
        return sum;
    }
    
}
