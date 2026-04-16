public class primeNo {
    public static void main(String[] args) {
        int n=100; // to print prime numbers present between 1 to 100

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime (int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
