/**
 * Created by mizeshuang on 2016/7/4.
 */
public class Test371 {
    public static int getSum(int a, int b) {
        int temp=0;
        while (b != 0) {
            temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(3, 1));
    }
}
