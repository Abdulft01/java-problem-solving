class checkEvenOdd {
    public static String isEvenOdd (int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("The number " + number + " is " + checkEvenOdd.isEvenOdd(number));
    }
}