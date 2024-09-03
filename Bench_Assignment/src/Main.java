import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Enter item name: ");
            String name = scanner.nextLine();

            System.out.print("Enter item price: ");
            double price = 0;
            while (true) {
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Enter item price again: ");
                }
            }

            System.out.print("Enter item quantity: ");
            int quantity = 0;
            while (true) {
                try {
                    quantity = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Enter item quantity again: ");
                }
            }

            System.out.print("Enter item type (Raw/Manufactured): ");
            String type = scanner.nextLine();
            while (!type.equalsIgnoreCase("raw") && !type.equalsIgnoreCase("manufactured")) {
                System.out.print("Invalid input. Enter item type (Raw/Manufactured) again: ");
                type = scanner.nextLine();
            }

            items.add(new Item(name, price, quantity, type));

            System.out.print("Do you want to enter details of any other item (y/n): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nItems Details:");
        for (Item item : items) {
            System.out.println(item);
        }

        scanner.close();
    }
}
