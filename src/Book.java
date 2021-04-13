import java.util.Scanner;

public class Book { // class declaration
    Scanner scanInput = new Scanner(System.in); // input object
    // attributes declaration
    private int id;
    String name;
    String author;

    public Book(int id, String name, String author){ // constructor method
        this.id = id; // this = reference for actual object // static attribute
        this.name = name;
        this.author = author;
    }

    public int getId() { // get method
        return id;
    }

    public void setId(int id) { // set method
        this.id = id;
    }

    public int input() {
        System.out.println("Insert ID (0-2): ");
        int option;
        // option = Integer.parseInt(JOptionPane.showInputDialog("Insert ID (0-2)"));
        option = scanInput.nextInt();// read user input

        return option; // return statement
    }

    // book status methods
    public void available() {
        System.out.println("\nThis book is available! :)");
    }
    public void rented(){
        System.out.println("\nThis book has been rented! Wait for it...");
    }
    public void sold(){
        System.out.println("\nThis book has been sold! Bad luck :(");
    }
}