public class maxElement {
    public static void main(String[] args) {
        int [][] arr =  new int[2][2];
         arr[0][0]=3;
         arr[0][1]=4;
         arr[1][0]=5;
         arr[1][1]=6;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }
    
}
