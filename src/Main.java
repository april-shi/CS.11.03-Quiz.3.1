public class Main {

    public static void main(String[] args) {
        System.out.println(endUp("hello"));
    }

    // Question 1 - calculateGrade
    public static char calculateGrade(int a) {

        if (a >= 90) {
            return 'A';
        }

        if (a >= 80 && a <= 89) {
            return 'B';
        }

        if (a >= 70 && a <= 79) {
            return 'C';
        }

        if (a >= 60 && a <= 69) {
            return 'D';
        }

        if (a >= 50 && a <= 59) {
            return 'E';
        }

        if (a <= 49) {
            return 'F';
        }

        return 0;

    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a) {

        if (a % 5 == 0 && a % 3 == 0) {
            return "fizzbuzz";
        }

        if (a % 3 == 0) {
            return "fizz";
        }

        if (a % 5 == 0) {
            return "buzz";
        }

        return "unlucky";

    }

    // Question 3 - frontBack
    public static String frontBack(String str) {

        if (str.length() >= 2) {
            String front = str.substring(0,2);

            return front + str + front;
        }

        return str;

    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {

        if (a + b == c || b + c == a || a + c == b) {
            return true;
        }

        return false;

    }

    // Question 5 - endUp
    public static String endUp(String str) {

        if (str.length() >= 3) {
            String end = str.substring(str.length()-3);
            return str.substring(0,str.length()-3) + end.toUpperCase();

        }

        return str.toUpperCase();

    }

}
