public class productOfDigits {
    public static int getProduct(int n){
        int prod = 1;
        while(n>0){
            int digit = n%10;
            prod = prod + digit;
            n = n/10;
        }

        return prod;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The product of the digits of "+n+" is: "+getProduct(n));
    }
}
