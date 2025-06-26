import 
class LibraryItem {
    String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void checkOut() {
        System.out.println(title + " checked out.");
    }

    public void returnItem() {
        System.out.println(title + " returned.");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super("");  
        this.title = title;
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super("");
        this.title = title;
    }
}

class Journal extends LibraryItem {
    public Journal(String title) {
        super("");
        this.title = title;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("Java Programming"));
        libraryItems.add(new DVD("Inception"));
        libraryItems.add(new Journal("Science Monthly"));

        System.out.println("Library Collection:");
        for (LibraryItem item : libraryItems) {
            item.displayInfo();
        }

        System.out.println("\nPerforming Library Operations:");
        libraryItems.get(0).checkOut();  
        libraryItems.get(1).checkOut();  
        libraryItems.get(2).returnItem(); 
    }
}
