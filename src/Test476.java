/**
 * 二进制数字补足
 *
 * @Author mizes
 * @Create 2017-09-14 22:01
 */
public class Test476 {
    public static void main(String[] args) {
        S476 s476 = new S476();
        System.out.println(s476.findComplement(8));
    }
}

class S476 {
    public int findComplement(int num) {
        double maxValue = Math.pow(2, 32) - 1;
        long temp = (long) maxValue;
        double l2 = Math.log(num) / Math.log(2);
        int l2Temp = (int) l2 + 1;
        long result = 0;
        result = temp ^ num;
        long l = 0;
        for(int i = l2Temp;i < 32; ++i) {
            l += Math.pow(2, i);
        }
        int ret = (int)(result - l);
        return ret;
    }
}