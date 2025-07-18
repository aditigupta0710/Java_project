public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1,7,6,9,4,5,6,3,8,8,4,6,3};
        System.out.println("duplicates : ");
        for(int i =0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
