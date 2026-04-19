public class palindrome {
    public static void main(String[] args) {
        int num = 12321;
        if(isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num){
        int org = num;
        int rev = getReverse(num);
        return org == rev;
    }

    public static int getReverse(int num){
        int rev = 0;
        while(num>0){
            int digit = num %10;
            rev = rev*10 + digit;
            num = num/10;
        }
        return rev;
    }
}
