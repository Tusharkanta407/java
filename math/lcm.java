public class lcm {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int n = 10; 
        int[] multiples1 = new int[n];
        int[] multiples2 = new int[n];

        
        for (int i = 0; i < n; i++) {
            multiples1[i] = (i + 1) * a;
            multiples2[i] = (i +1) * b;
        int lcm = -1;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (multiples1[i] == multiples2[j]) {
                    lcm = multiples1[i];
                    break outerLoop; 
                }
            }
        }
        if (lcm != -1) {
            System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        } else {
            System.out.println("LCM not found within the first " + n + " multiples.");
        }
    }
}
}
