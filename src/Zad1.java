public class Zad1 {

    /*
    Napisz funkcję, która odwróci string. Czyli z np.: "domek" zrobi "kemod".
     */

    public static String reverseString(String expression) {
        if (expression.isEmpty() || expression.isBlank()) {
            throw new IllegalArgumentException("Expression is empty or blank!");
        }
        StringBuilder result = new StringBuilder();
        return result.append(expression).reverse().toString();
    }

    public static void main(String[] args) {

        String example = "domek";
        String reverseExample = reverseString(example);
        System.out.println(reverseExample);
    }
}
