public class Decryptor {
    public Decryptor() {
    }

    public static void main(String[] args) {
    }

    public static long[] decrypt(long[] a) {
        return a;
    }

    public static long[] desimple(long[] a) {
        for(int m = 0; m < a.length; ++m) {
            a[m] -= (long)(2 * m + 1);
        }

        return a;
    }
}
