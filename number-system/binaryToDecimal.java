public class binaryToDecimal {
    public static void main(String[] args) {
        int binaryNumber = 1011;
        System.out.println(getBinToDec(binaryNumber));
    }

    public static int getBinToDec(int binaryNumber){
        int sum = 0;
        int p = 0;

        while(binaryNumber>0){
            int digit = binaryNumber % 10;
            sum += digit * Math.pow(2, p);
            p++;
            binaryNumber /= 10;
        }
        
        return sum;
    }
}
