public class addressbuilder {
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = Scanner.createScanner(System.in);

        // Prompt for full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        // Split into first and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // Prompt for date of the show
        System.out.print("Enter the date of the show: ");
        String date = input.nextLine();

        // Prompt for number of tickets
        System.out.print("Enter number of tickets: ");
        int tickets = input.nextInt();

        // Build confirmation message using StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append(tickets);

        // Handle plural vs. singular
        if (tickets == 1) {
            sb.append(" ticket reserved for ");
        } else {
            sb.append(" tickets reserved for ");
        }

        sb.append(date);
        sb.append(" under (");
        sb.append(lastName);
        sb.append(", ");
        sb.append(firstName);
        sb.append(")");

        // Display final confirmation
        assert sb.toString() != null;
        sb.toString().println(System.out);
    }

    private static class Scanner {
        private Scanner(java.lang.Object in) {

        }

        public static Scanner createScanner(java.lang.Object in) {
            return new Scanner(in);
        }

        public int nextInt() {
            return 0;
        }

        public String nextLine() {
            return null;
        }
    }

    private static class System {
        public static java.lang.Object in;
        public static java.lang.Object out;
    }

    private static class String {
        public String[] split() {
            String[] split = split((java.lang.String) null);
            return split;
        }

        public String[] split(java.lang.String space) {
            return null;
        }
    }

    private static class StringBuilder {
        public java.lang.Object toString() {
            java.lang.Object o;
            o = null;
            return o;
        }

        public void append(java.lang.String string) {

        }

        public void append(String date) {

        }

        public void append(int tickets) {

        }
    }
}