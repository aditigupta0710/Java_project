public class lesstimepower {
    static int power(int p , int q) {
        if(q == 0) return 1;

        int smallpow = power(p, q/2);
        if (q % 2 == 0) {
            return smallpow * smallpow;
        }
        return p * smallpow * smallpow;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
