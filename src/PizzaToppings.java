import java.util.Scanner;

public class PizzaToppings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome to Java Pizza - how many toppings would you like on your pizza?");
        int numToppings = scan.nextInt();
        String[] toppings = new String[numToppings];
        System.out.println("Great! Enter each topping: ");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i+1 + ". ");
            String topping = scan.next();
            toppings[i] = topping;
        }
        System.out.println("Thank you! Here are the toppings you ordered: ");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i+1 + ". " + toppings[i]);
        }
        System.out.println("Press anything to confirm your order!");
        scan.nextLine();
        scan.nextLine();
        System.out.println("Your order has been placed and will be on the way shortly!");
        scan.close();
    }
}
