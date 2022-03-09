public class Zad8 {


    public static boolean isLeapYear(int year) {
        if (year <= -1) {
            throw new IllegalArgumentException("The year shall not be a negative number");
        }

        boolean isLeap = false;

        if (isDivisibleByFour(year)) {
            isLeap = true;
            if (isDivisibleByOneHundred(year)) {
                isLeap = true;
                if (isDivisibleByFourHundred(year)) {
                    isLeap = true;
                }
            }
        }
        return isLeap;
    }

    public static boolean isDivisibleByFour(int number) {
        return number % 4 == 0;
    }

    public static boolean isDivisibleByOneHundred(int number) {
        return number % 100 == 0;
    }

    public static boolean isDivisibleByFourHundred(int number) {
        return number % 400 == 0;
    }

    public static void yearIsLeapInformation(int year) {
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }



    public static void main(String[] args) {

        int year1 = 2000;
        yearIsLeapInformation(year1);


        int year2 = 2001;
        yearIsLeapInformation(year2);

    }
}
