public class nprimeNum {
    public static void main(String[] args) {
        int n=3;
        int i=2;
        int count = 0;
        // to find the first n prime numbers
        while(true){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count==n){
                    break;
                }
            }
            i++;
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
