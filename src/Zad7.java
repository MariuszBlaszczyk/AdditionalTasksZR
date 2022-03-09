public class Zad7 {

    /*
    Napisz prostą aplikację sprawdzającą, czy wyraz jest palindromem.
    Co to palindrom? To wyraz, który można czytać tak samo z obu stron.
    Np. oko, Ala, łamał
     */


    public static boolean isPalindrome(String expression) {
        if (expression.isBlank() || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression is blank or empty");
        }

        String toLowerCase = expression.toLowerCase();

        StringBuilder reverse = new StringBuilder(toLowerCase);
        reverse.reverse();
        return (reverse.toString()).equals(toLowerCase);
    }

    public static void result(String expression) {
        if (isPalindrome(expression)) {
            System.out.println("Hurra! The word is a palindrome.");
        } else {
            System.out.println("Unfortunately. The word is not a palindrome.");
        }
    }


    public static void main(String[] args) {

        String expression = "RaDar";
        result(expression);
    }
}
