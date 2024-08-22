

public class mergeSort{
    public static void merge(int arr[], int low ,int  mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] l=new int[n1];
        int[] h=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            h[j]=arr[mid+1+j];
        }
        int i=0;int j=0;int k=low;
        while (i < n1 && j < n2) {
            if (l[i]<=h[j]) {
                arr[k]=l[i];
                i++;   
            }else{
                arr[k]=h[j];
                j++;
            }
            k++; 
        }
        while (i<n1) {
            arr[k]=l[i];
            k++;
            i++;
        }
        while (j<n2) {
            arr[k]=h[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int arr[],int low,int high ){
        if (low<high) {
           int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr, low , mid, high);
            
            
        }
        
        
        
    }  public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
    



    }



