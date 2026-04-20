public class nthprimeNum {
    public static void main(String[] args) {
        int n=3;
        int i=2;
        int count = 0;
        // to find the nth prime number
        while(true){
            if(isPrime(i)){
                
                count++;
                if(count==n){
                    System.out.println(i);
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