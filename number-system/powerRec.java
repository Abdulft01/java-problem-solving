public class powerRec {
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }

        return n*power(n,p-1);
    }

    public static void main(String[] args) {
        int n=2, p=5;
        System.out.println(n+" raised to the power "+p+" is: "+power(n,p));
    }
}
