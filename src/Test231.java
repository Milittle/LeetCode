/**
 * Created by mizeshuang on 2016/7/16.
 */
public class Test231 {
    public static void main(String[] args) {
        System.out.println(new Test231().isPowerOfTwo(16));
    }
    public boolean isPowerOfTwo(int n) {
        if (n == 0 || n < 0) return false;
        else {
            return 0 == (n & n - 1);
        }
    }
}
