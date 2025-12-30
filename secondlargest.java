public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {10,4,3,53,43};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
            }
            System.out.println("second largest : " +second);
        }
    }

