 class arrayexample {
    void demoarrays (){
        int[] ages =new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];
        ages[0] = 34;
        ages[1] = 13;
        ages[2] = 45;
        weights[0] = 23.4f;
        weights[1] = 34.5f;
        System.out.println(ages[0]);
    }
}
public class measure {
    public static void main(String[] args) {
        arrayexample obj = new arrayexample();
        obj.demoarrays();
        
    }
}
