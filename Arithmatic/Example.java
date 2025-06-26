import ArithmeticPackage.Arithmetic;
import ArithmeticPackage.Arithmetic2;

class Example implements Arithmetic2 {
    @Override
    public double square_root(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double cube(double num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Square Root of 16: " + obj.square_root(16));
        System.out.println("Cube of 3: " + obj.cube(3));

        // Using Arithmetic class methods
        System.out.println("Addition of 5 and 3: " + Arithmetic.add(5, 3));
        System.out.println("Subtraction of 5 and 3: " + Arithmetic.subtract(5, 3));
    }
}

