public class employee {
    private String name;
    private String Address;
    private int yearOfJoining;
    public employee(String name, String Address, int yearOfJoining) {
        this.name = name;
        this.Address = Address;
        this.yearOfJoining = yearOfJoining;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address : " + Address);
        System.out.println("yearOfJoining : " + yearOfJoining);
    }
    public static void main(String[]args) {
        employee emp1 = new employee("Tushar", "Bhubaneswar", 2010);
        employee emp2 = new employee("Roshan", "Cuttack", 2012);
        employee emp3 = new employee("Rakesh", "Dhenkanal", 2006);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        
        
    }

    
}
