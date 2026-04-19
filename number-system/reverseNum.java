public class reverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = getReverse(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reverse);
    }

    public static int getReverse(int num){
        int reverse = 0;

        while(num>0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }

        return reverse;
    }
}
