class gcd {
    public static void main(String[] args) {
        int n = 10;
        int m = 100;
        int gcd = 0;

        for(int i=1; i<n && i<m; i++) {
            if(n%i==0 && m%i==0 ){
                gcd = i;
            }
        }
        System.out.println("GCD of " + n + " and " + m + " is: " + gcd);

    }
}