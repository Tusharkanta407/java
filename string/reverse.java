public class reverse {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello World");
        String str ="";
        int n = s.length();
        for(int i=n-1;i>0;i--){
            str+= s.charAt(i);


        }
        System.out.println("Reversed String: " + str);

        
    }
    
}
