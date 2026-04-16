public class powerNoRec {
    public static int power(int n, int p){
        int pow =1;
        for(int i=1;i<=p;i++){
            pow = pow * n;
        }
        return pow;
    }

    public static void main(String[] args) {
        int n = 2, p = 3;
        System.out.println(n+" raised to the power "+p+" is: "+power(n,p));
    }
}
