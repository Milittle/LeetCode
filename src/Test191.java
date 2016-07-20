/**
 * Created by mizeshuang on 2016/7/17.
 */
public class Test191 {
    public static void main(String[] args) {
        System.out.println(new Test191().hammingWeight(34));
    }

    public int hammingWeight(int n) {
        int temp = 0;
        Integer t = n;
        char[] sum = t.toString().toCharArray();
        System.out.println(sum[1]);
        for(int i=0;i<sum.length;i++) {
            System.out.println(i);
            if (sum[i] == '1') {
                temp++;
            }
        }
        return temp;
    }
}
