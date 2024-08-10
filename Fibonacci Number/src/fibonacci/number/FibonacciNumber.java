package fibonacci.number;

public class FibonacciNumber {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 +"\n"+num2);
        for (int i = 0; i < 11; i++) {
            int fibo = num1+num2;
            System.out.println(fibo);
            num1=num2;
            num2=fibo;
        }
    }
    
}
