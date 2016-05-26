/**
 * Created by mizeshuang on 2016/5/25.
 */
public class Test136 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1,1,1,2,3,4,5,8,7,8,7,5,4,3,2};
        System.out.println(single(a));
    }

    public static int singleNumber(int[] nums) {
        Integer temp=null;
        for (int i = 0; i < nums.length; i++) {
            int n = 0;
            temp = nums[i];
            for(int j=0;j<nums.length;j++) {
                if (nums[i] == nums[j]&&i!=j) {
                    break;
                } else {
                    n++;
                }
            }
            if (n == nums.length) {
                break;
            }
        }
        return temp;
    }

    public static int single(int[] nums) {
        int temp;
        temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            temp = temp ^ nums[i];
        }
        return temp;
    }
}
