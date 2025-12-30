import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void bucketsort(float[] arr) {
        int n = arr.length;
        if(n <= 0) return;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        // add elemnts into buckets
        for(int i = 0; i < n; i++) {
            int bucketindex = (int) arr[i] * n;
            buckets[bucketindex].add(arr[i]);
        }
        // sort each bucket individally
        for(int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        //merge all sorted buckets
        int index = 0;
        for(int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketsort(arr);
        for(float val : arr) {
            System.out.println(val + " ");
        }
    }
}
