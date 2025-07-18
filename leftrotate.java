import java.util.Arrays;

public class leftrotate {
    public static void main(String[] args) {
        int[] arr = {1,3,3,2,2,2,5,5,4};
        int first = arr[0];
        for(int i = 0; i < arr.length-1; i++) 
            arr[i] = arr[i + 1];
            arr[arr.length -1] = first;
            System.out.println(Arrays. toString(arr));
        
    }    
}
