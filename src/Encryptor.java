public class Encryptor {
    public Encryptor() {
    }

    public static void main(String[] args) {
    }

    private static long[] encrypt(String a) {
        byte[] b = a.getBytes();
        long[] k = new long[b.length];

        for(int i = 0; i < b.length; ++i) {
            k[i] = (long)b[i];
            System.out.println(k[i]);
        }

        return simple(k);
    }

    public static long[] simple(long[] a) {
        for(int m = 0; m < a.length; ++m) {
            a[m] += (long)(2 * m + 1);
            System.out.println(a[m]);
        }

        return a;
    }
}
