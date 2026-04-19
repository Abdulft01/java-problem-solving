public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        if(isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int org = num;
        int sum = 0;
        int count = (num+"").length();

        while(num>0){

            sum += (int)Math.pow(num%10, count);
            num /= 10;
        }

        return sum == org;
    }
}
