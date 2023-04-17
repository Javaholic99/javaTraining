import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Helper help = new Helper();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String condition = scanner.next();
        switch (condition.toLowerCase()) {
            case "add":
                help.add(a, b);
                break;
            case "sub":
                help.sub(a, b);
                break;
            case "multiply":
                help.multiply(a, b);
                break;
            case "div":
                if (b != 0) {
                    help.div(a, b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case "square":
                help.square(a);
                break;
            case "cube":
                help.cube(a);
                break;
            case "quotient":
                help.quotient(a, b);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
