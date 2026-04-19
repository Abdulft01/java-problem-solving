public class neonNum {
    public static void main(String[] args) {
        int num = 9;
        if(isNeon(num)) { // to check if the number is a Neon number or not
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
    }

    public static boolean isNeon(int num) {
        int org = num; // for comparing the sum and original number
        int square = num * num;
        int sum = 0;
        
        while(square > 0){
            int digit = square % 10; // to get the last digit
            sum += digit; // to add the last digit to the sum
            square /= 10; // to remove the last digit
        }
        return sum == org; // returns true or false based on the comparison of sum and original number
    }
}
