public class doWhile{
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println("Even number is: " + i);
            } else {
                System.out.println("Odd number is: " + i);
            }
            i++;
        } while (i < 1000);
    }
}
