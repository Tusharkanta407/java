public class test3 {
    static int x, y,z; 

    public static int max(int p1, int p2,int p3) {
        x = p1;
        y = p2;
        z = p3;
        if (x>y&&x>z) {
            return x;
        } else if(y>z) {
            return y;
        }else{
            return z;
        }
    }

   

    public static void main(String[] args) {
        int result = max(10, 20,30);
        System.out.println("The maximum value is: " + result);
    }
}
