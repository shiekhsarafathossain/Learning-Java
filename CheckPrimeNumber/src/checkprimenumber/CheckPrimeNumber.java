package checkprimenumber;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to check prime or not: ");
        num = sc.nextInt();
        if(checkPrime(num) == true){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("It is not a prime number.");
        }
    }
    
    static boolean checkPrime(int num){
        int count = 1;
        if(num <= 1){
            return false;
        }
        else{
            for (int i = 2; i <= num; i++) {
                if (num%i == 0){
                    count++;
                }
            }
        }
        return (count == 2);
    }
    
}
