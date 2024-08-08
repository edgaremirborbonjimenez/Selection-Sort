public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] arr) {
        int smallest,index=0;
        for(int i = 0; i<arr.length; i++){
            smallest = arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(smallest > arr[j]){
                    smallest=arr[j];
                    index=j;
                }
            }
            if(i!=arr.length-1){
                arr[index]=arr[i];
                arr[i]=smallest;
            }
        }
    }
}
