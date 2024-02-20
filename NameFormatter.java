import java.util.Scanner;

public class NameFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the full name
        System.out.println("Enter the full name (format: <first name> <last name>):");
        String fullName = scanner.nextLine();
        
        // Call the printName method to format and print the name
        printName(fullName);
        
        scanner.close();
    }

    public static void printName(String fullName) {
        // Trim leading and trailing spaces
        fullName = fullName.trim();
        
        // Split the full name into first and last names
        String[] names = fullName.split("\\s+");
        
        // Reformat and print the name
        if (names.length >= 2) {
            // Extract first and last names
            String firstName = names[0];
            String lastName = names[names.length - 1];
            
            // Print the reformatted name
            System.out.println(lastName + "," + firstName);
        } else {
            // Handle invalid input (no last name)
            System.out.println("Invalid name format: " + fullName);
        }
    }
}
