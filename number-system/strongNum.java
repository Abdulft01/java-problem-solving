public class strongNum {
    public static void main(String[] args) {
        int num = 145;
        if(isStrong(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }

    public static boolean isStrong(int num) {
        int sum = 0;
        int org = num; // to compare later with the sum of factorials

        while(num>0){
            int digit = num%10;
            int fact = factorial(digit);
            sum += fact;
            num /=10;
        }
        return sum == org;
    }

    public static int factorial(int n) {
        if(n == 0|| n==1)
            return 1;
        else
            return n* factorial(n-1);
    }
}
