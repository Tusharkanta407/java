public class countNoOfObj {
   private static int count = 0;
    public countNoOfObj(){
        count++;
    }
    public static int countNoObj() {
        return count;
        
    }
    public static void main(String[] args) {
        countNoOfObj obj1 = new countNoOfObj();
       countNoOfObj obj2 = new  countNoOfObj();
    countNoOfObj obj3 = new countNoOfObj();
        System.out.println("no of object in class is " + countNoOfObj.countNoObj());


      
    }
    
}
