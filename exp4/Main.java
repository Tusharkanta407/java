import java.util.Scanner;
class Z {
    protected double p = 3.14; 
}
class Shape extends Z {
    protected int r; 

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextInt();
        sc.close(); 
    }
}
class Circle extends Shape {
    public void area() {
        double area = p * r * r;
        System.out.println("Area: " + area);
    }
}
class Circumference extends Shape {
    public void circumference() {
        double c = 2 * p * r;
        System.out.println("Circumference: " + c);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        obj1.input();
        obj1.area();

        Circumference obj2 = new Circumference();
        obj2.r = obj1.r; 
        obj2.circumference();
    }
}

  

