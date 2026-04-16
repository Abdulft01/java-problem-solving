public class spyNum {
    public static boolean isSpy(int n){
        int sum = 0;
        int prod = 1;

        while(n>0){
            int digit = n%10;
            sum += digit;
            prod *= digit;
            n=n/10;
        }

        return sum == prod;
    }

    public static void main(String[] args) {
        int num = 123;
        if(isSpy(num)){
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
    }
}
