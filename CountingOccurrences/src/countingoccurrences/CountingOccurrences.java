package countingoccurrences;

import java.util.Scanner;

public class CountingOccurrences {

    static int occur(int num, int occur) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == occur) {
                count++;
            }
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num,occur;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        num = sc.nextInt();
        System.out.print("Enter Which digit you want to count: ");
        occur = sc.nextInt();
        
        int result = occur(num,occur);
        System.out.println(occur+" Number Occurs in "+num+" is "+result+" times.");
    }

}
