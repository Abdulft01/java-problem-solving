public class checkEvenOddNoModulo {
    public static String isEvenOdd (int num) {
        if(num/2 *2 == num) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(num + " is " + checkEvenOddNoModulo.isEvenOdd(num));
    }
}
