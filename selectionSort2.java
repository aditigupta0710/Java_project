public class selectionSort2 {
    static void SelectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int min_index = i;
            for(int j = i+1; j < n; j++) {//i represent the current index
                //find the mminimum element in unsorted part of array
                if(arr[j] < arr[min_index]) {
                min_index = j;
                }   
            }
            //swap current element and minimum element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr =  {7,4,6,7,8,3,2,1,4,5};
        SelectionSort(arr);
        for(int i = 0; i < arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
