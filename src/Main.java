// import javax.swing.*; // import JOptionPane for popups
import java.util.Scanner; // import Scanner for user input

public class Main {
    public static void main(String[] args) {
        Book b0 = new Book(0, "The Bounty", "Janey Evanovich"); // object declarations
        Book b1 = new Book(1, "Deacon King Kong", "James McBride");
        Book b2 = new Book(2, "Hamnet", "Maggie O'Farrel");

        // switch case depending on option
        switch (b0.input()) {
            case 0:
                // print book info
                System.out.println("ID: " + b0.getId()); // print ID through Get method
                System.out.println("Book name: " + b0.name);
                System.out.println("Book author " + b0.author);
                b0.available(); // print available
                break;
            case 1:
                System.out.println("ID: " + b1.getId());
                System.out.println("Book name: " + b1.name);
                System.out.println("Book author " + b1.author);
                b1.rented(); // print rented
                break;
            case 2:
                System.out.println("ID: " + b2.getId());
                System.out.println("Book name: " + b2.name);
                System.out.println("Book author " + b2.author);
                b2.sold(); // print sold
                break;
            default:
                System.out.println("Invalid option. Please restart...");
                break;
        }
    }
}