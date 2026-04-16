public class sumEvenDigits {
    public static int getSumEven(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            if(digit%2==0){
                sum += digit;
            }
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The sum of the even digits of "+n+" is: "+getSumEven(n));
    }
}
