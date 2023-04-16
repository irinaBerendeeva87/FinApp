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

        while(true){//настройте бесконечный цикл здесь
            System.out.println("What do you want to do? ");
            System.out.println("1 - Convert currency");
            System.out.println("2 - Get an advice");
            System.out.println("0 - Exit");//menu

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("With currency do you want to convert rubles into? Available Options: 1 - USD, 2 - EUR or 3 - JPY.");
                int currency = scanner.nextInt();

                if (currency == 1) {
                    System.out.println("Your saving in dollars: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Your saving in euro: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Your saving in yen: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Currency not supported");
                }

            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("It's better to eat at home today. Save money and you will make it to your next paycheck!");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Okay, it's time to go to McDonald's.");
                    } else {
                        System.out.println("It's better to eat at home today. Save money and you will make it to your next paycheck!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Not bad! Get some dollars and go have dinner at a great place. :)");
                    } else {
                        System.out.println("Okay, it's time to go to McDonald's.!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Great! Order some crabs!");
                    } else {
                        System.out.println("Not bad! Get some dollars and go have dinner at a great place. :)");
                    }
                }
            } else if (command == 0) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Sorry, there is no such command yet.");
            }
        }
    }
}

