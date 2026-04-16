public class countNoDigits {
    public static int getCount(int n){
        int count =0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The number of digits in "+n+" is: "+getCount(n));
    }
}
