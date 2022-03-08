import java.util.Random;
import java.util.Scanner;

public class Zad3 {

    /*
    Komputer powinien wylosować liczbę całkowitą z zakresu 1 do 100.
    Gracz ma za zadanie odgadnąć cyfrę.
    Komputer powinien informować, czy podana przez gracza liczba jest poprawna
    (koniec gry i napis o wygranej) czy jest za duża, czy za mała.
     */

    public static int generateRandomNumber() {
        return new Random().nextInt(100) + 1;
    }

    public static int generateUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number between 1 and 100");
        int userNumber;
        do {
            userNumber = scanner.nextInt();
            if (userNumber <= 0 || userNumber >= 101) {
                System.out.println("The number must be between 1 and 100");
            }
        } while ((userNumber <= 0 || userNumber >= 101));
        return userNumber;
    }

    public static void numberCheck(int generateNumber, int userNumber) {
        if (generateNumber <= 0 || generateNumber >= 101) {
            throw new IllegalArgumentException("The generate number must be between 1 and 100");
        }

        if (userNumber <= 0 || userNumber >= 101) {
            throw new IllegalArgumentException("The user number must be between 1 and 100");
        }

        do {
            if (userNumber > generateNumber) {
                System.out.println("The number given is too high");
                userNumber = generateUserNumber();
            } else if (userNumber < generateNumber) {
                System.out.println("The number given is too low");
                userNumber = generateUserNumber();
            }
        } while (userNumber != generateNumber);

        System.out.println("Game over! You have hit the number!");
        System.out.println("Generate number: " + generateNumber);
        System.out.println("Your number: " + userNumber);
    }

    public static void main(String[] args) {


        int generateNumber = generateRandomNumber();

        int userNumber = generateUserNumber();

        numberCheck(generateNumber, userNumber);

    }
}
