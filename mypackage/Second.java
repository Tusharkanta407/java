package mypackage;  // Ensure this is added

import mypackage.First;  // Import First class

public class Second {
    public static void main(String[] args) {
        First obj = new First();  // Create an object of First
        obj.displayMessage();  // Call method
    }
}


