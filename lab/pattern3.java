public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        //print space
        for (int i = 0; i <= n; i++) {
            for(int j=i;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j); 
            }
            System.out.println();
        }
    
        
    }
    
}
