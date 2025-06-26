import java.util.Scanner;

public class StockPrices {
    public static void main(String[] args) {
        
       
     Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();
     String[][] stockPrices = new String[n][2];
      
    
     for (int i = 0; i < n; i++) {
        System.out.print("Enter time (AM/PM) for stock " + (i + 1) + ": ");
        stockPrices[i][0] = sc.nextLine();
        System.out.print("Enter stock value at " + stockPrices[i][0] + ": ");
        stockPrices[i][1] = sc.nextLine();
    }
    for(int i=0;i<n;i++){
        System.out.println("Time: " + stockPrices[i][0] + " - Price: " + stockPrices[i][1]);

    }
    

    }
    
}
