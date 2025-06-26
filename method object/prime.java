public class prime {
   
    public static boolean isPrime(int n){
        boolean isPrime=true;
       for(int i=2;i<n;i++){
        if (n%i==0) {
            isPrime=false;

            
        }
       }
       return isPrime;
      
    }
    public static void inRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i))
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // public static boolean isPrime( int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if (i%n==0) {
    //             return false;
                
    //         }
    //     }
    //     return true;
    // }

public static void main(String[] args) {
inRange(20);

}
    
}

