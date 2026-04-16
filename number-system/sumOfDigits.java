public class sumOfDigits {
    public static int getSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The sum of the digits of "+n+" is: "+getSum(n));
    }
}
