public class decimalToOctal {
    public static void main(String[] args) {
        int decimal = 75;
        System.out.println(getDecToOctal(decimal));
    }

    public static String getDecToOctal(int decimal){
        String oct = " ";
        while(decimal > 0){
            int rem = decimal % 8;
            oct = rem + oct;
            decimal = decimal / 8;
        }
        return oct;
    }
}
