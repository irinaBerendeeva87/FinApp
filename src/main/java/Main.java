import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you have before payday?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("How many days before payday?");
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Input a command. Available  commands: convert and advice.");
        String command = scanner.next();

        if (command.equals("convert")) {
            System.out.println("With currency do you want to convert rubles into: USD, EUR, JPY.");
            String currency = scanner.next();

            if (currency.equals("USD")) {
                System.out.println("Your saving in dollars: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Your saving in euro: " + moneyBeforeSalary / rateEUR);
            } else if (currency.equals("JPY")) {
                System.out.println("Your saving in yen: " + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("Currency not supported.");
            }

        } else if (command.equals("advice")) {
            if (moneyBeforeSalary < 3000) {
                System.out.println("It's better to eat at home today. Save money and you will make it to your next paycheck!");
            } else if (moneyBeforeSalary < 10000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Okay, it's time to go to McDonald's!");
                } else {
                    System.out.println("It's better to eat at home today. Save money and you will make it to your next paycheck!");
                }
            } else if (moneyBeforeSalary < 30000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Great! Get some dollars and go have dinner at a fancy place. :)");
                } else {
                    System.out.println("Okay, it's time to go to McDonald's!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Great! Order some crabs!");
                } else {
                    System.out.println("Not bad! Get some dollars and go have dinner at a great place. :)");
                }
            }
        } else {
            System.out.println("Sorry, there is no such command yet.");
        }
    }
}
