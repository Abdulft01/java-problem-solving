public class decimalToBinary {
    public static void main(String[] args) {
        int deicmal = 14;
        System.out.println(getDecToBin(deicmal));
    }

    public static String getDecToBin(int decimal){
        String bin = " ";
        while(decimal>0){
            int rem = decimal%2;
            bin = rem + bin;
            decimal =decimal/2;
    
        }
        return bin;
    }
}
