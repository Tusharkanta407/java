public class bCofficent {
    public static int fact(int n){
        int f =1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomial(int n , int r){
       int a = fact(n);
       int b = fact(r);
         int c = fact(n-r);
       int binomialCf = (a*b)/c;
       return binomialCf;
    }    public static void main(String[] args) {
      
        int answer=binomial(4, 2);
        System.out.println(answer);
       }
   
    
}
