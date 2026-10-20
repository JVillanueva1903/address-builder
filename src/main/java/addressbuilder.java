public class addressbuilder {
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // StringBuilder to store user inputs
        StringBuilder sb = new StringBuilder();

        // Prompt for full name
        com.pluralsight.Main.System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        sb.append(fullName).append("\n");

        // Prompt for show date
        System.out.print("Enter the date of the show: ");
        String date = input.nextLine();
        sb.append(date).append("\n");

        // Prompt for number of tickets
        System.out.print("Enter number of tickets: ");
        int tickets = input.nextInt();
        sb.append(tickets).append("\n");

        // Extract first and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // Build confirmation message
        String ticketWord;
        if (tickets == 1) {
            ticketWord = "ticket";
            System.out.println();
        } else {
            ticketWord = "tickets";
            System.out.println();
        }

        System.out.println(tickets + " " + ticketWord + " reserved for "
                + date + " under (" + lastName + ", " + firstName + ")");

        // Required formatted output block
        System.out.println();
        System.out.println(fullName);
        System.out.println("Billing Address:");
        System.out.println("123 Main Street");
        System.out.println("Middleton, TX 75111");
        System.out.println("Shipping Address:");
        System.out.println("456 Big Sky Blvd");
        System.out.println("Outer Rim, TX 75333");

        input.close();
    }

    private static class String {
    }

    private static class Scanner {
        public String nextLine() {


        }

        public int nextInt() {


        }

        public void close() {

        }
    }

    private static class StringBuilder {
    }

    private static class System {
        public static java.lang.Object out
                ;
    }
}