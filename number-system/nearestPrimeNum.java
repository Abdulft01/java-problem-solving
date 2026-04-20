public class nearestPrimeNum {
    public static void main(String[] args) {
        int n=10;
        int prev = n-1;
        int next = n+1;

        // to find the nearest prime number

        while(true){
            if(isPrime(prev)){
                System.out.println(prev);
                break;
            }
            if(isPrime(next)){
                System.out.println(next);
                break;
            }
            prev--;
            next++;

        }
    }

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}