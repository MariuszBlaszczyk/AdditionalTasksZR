import java.util.Random;

public class Zad2 {

    /*
     Stwórz generator hasła.
     Hasło musi zawierać co najmniej jedną cyfrę
     Hasło musi zawierać co najmniej jedną dużą literę
     Hasło musi zawierać co najmniej jedną małą literę
     Hasło musi zawierać co najmniej jeden znak specjalny
     Hasło musi mieć między 10 a 15 znaków
     Hasło nie może zawierać znaków "mylących", 1, I, O, 0

 private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";

     */

    private static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min > Max !!!");
        }
        return new Random().nextInt(max - min + 1) + min;
    }


//    public static String passwordGenerator() {
//        int minPasswordLength = 10;
//        int maxPasswordLength = 15;
//        int passwordLength = generateNumber(minPasswordLength, maxPasswordLength);
//
//        for (int i = 0; i < passwordLength; i++) {
////zrobić losowanie
//            //regexem wyjkluczyć wystąpenia
//
//        }
//    }

    public static void main(String[] args) {

        int passwordLength = new Random().nextInt(6) + 10;
        System.out.println(passwordLength);
    }
}



