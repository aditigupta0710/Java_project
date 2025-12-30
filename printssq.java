public class printssq { 
    static void PrintSSQ(String s , String currAns) {
        if(s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);
        PrintSSQ(remString, currAns + curr);//including curr
        PrintSSQ(remString, currAns);//excluding curr
    }
    public static void main(String[] args) {
        PrintSSQ("abc", " ");
    }
}
