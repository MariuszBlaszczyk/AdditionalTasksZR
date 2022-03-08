import java.util.Scanner;

public class Zad4 {


    public static void result() {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        boolean isTrue = true;
        double userTemperature;

        do {
            showMenu();
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 0 -> {
                    System.out.println("Exit from the program");
                    isTrue = false;
                }
                case 1 -> {
                    System.out.println("Specify the temperature:");
                    userTemperature = scanner.nextDouble();
                    double kelvin = celsiusToKelvin(userTemperature);
                    double fahrenheit = celsiusToFahrenheit(userTemperature);
                    System.out.println(userTemperature + "°C is " + kelvin + "°K");
                    System.out.println(userTemperature + "°C is " + fahrenheit + "°F");
                    isTrue = false;
                }
                case 2 -> {
                    System.out.println("Specify the temperature:");
                    userTemperature = scanner.nextDouble();
                    double celsius = kelvinToCelsius(userTemperature);
                    double fahrenheit = kelvinToFahrenheit(userTemperature);
                    System.out.println(userTemperature + "°K is " + celsius + "°C");
                    System.out.println(userTemperature + "°K is " + fahrenheit + "°F");
                    isTrue = false;
                }
                case 3 -> {
                    System.out.println("Specify the temperature:");
                    userTemperature = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(userTemperature);
                    double kelvin = fahrenheitToKelvin(userTemperature);
                    System.out.println(userTemperature + "°F is " + celsius + "°C");
                    System.out.println(userTemperature + "°F is " + kelvin + "°K");
                    isTrue = false;
                }
                default -> System.out.println("You have dialled an incorrect number. Dial the number again.");

            }
        } while (isTrue);
    }

    private static void showMenu() {
        System.out.println("Select the number corresponding to the temperature unit");
        System.out.println("1 - Celsius");
        System.out.println("2 - Kelvin");
        System.out.println("3 - Fahrenheit");
    }

    public static double celsiusToKelvin(double temperature) {
        return temperature + 273.15;
    }

    public static double celsiusToFahrenheit(double temperature) {
        return ((temperature * 9) / 5) + 32;
    }

    public static double kelvinToCelsius(double temperature) {
        return temperature - 273.15;
    }

    public static double kelvinToFahrenheit(double temperature) {
        return ((temperature - 273.15) * 1.8000) + 32.00;
    }

    public static double fahrenheitToCelsius(double temperature) {
        return ((temperature - 32) * 5) / 9;
    }

    public static double fahrenheitToKelvin(double temperature) {
        return ((temperature - 32) * 5 / 9) + 273.15;
    }

    public static void main(String[] args) {

        result();


    }
}
