public class binarySearch {
  public static void main(String[] args) {
      int[] arr = {2, 3, 5, 7, 9, 34};
      int n = arr.length;
      int target = 7;
      int low = 0;
      int high = n - 1;

      while (low <= high) {
          int mid = (low + high) / 2;

          if (arr[mid] == target) {
              System.out.println("Target found at index: " + mid);
              return;
          } else if (arr[mid] > target) {
              high = mid - 1; 
          } else {
              low = mid + 1; 
          }
      }

      System.out.println("Target not found");
  }
}





       
    

