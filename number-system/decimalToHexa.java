public class decimalToHexa {
    public static void main(String[] args) {
        int decimal = 31;
        System.out.println(getDecToHexa(decimal));
    }

    public static String getDecToHexa(int decimal){
        String hex = " ";
        while(decimal>0){
            int rem = decimal%16;
            if(rem>9){
                hex = (char)(rem+55) + hex;
            } else {
                hex = rem + hex;
            }
            decimal = decimal/16;
        }
        return hex;
    }
}
