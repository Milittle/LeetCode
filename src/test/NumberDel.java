package test;

/**
 * 删数字
 * 有点栈溢出问题 需要解决一下
 * @Author mizes
 * @Create 2017-09-17 18:24
 */
public class NumberDel {
    public static void main(String[] args) {
        int i = 500;
        int[] nums = new int[i];
        for(int j = 0; j < nums.length; ++j) {
            nums[j] = j + 1;
        }

        int index = deleteNumber(nums);
        System.out.println(nums[index]);
    }

    public static int deleteNumber(int[] args) {
        char[] ar = new char[args.length];
        for(int i = 0; i < ar.length; ++i) {
            ar[i] = 1;
        }
        ar = delete(ar, 0, 0);
        int index = isOne(ar);
        return index;
    }

    public static char[] delete(char[] ar, int begin, int gap)
    {
        if (isOne(ar) != -1) {
            return ar;
        } else {
            if (ar[begin] == 1 && gap == 2) {
                ar[begin] = 0;
                gap = 0;
                ar = delete(ar, (begin + 1) % ar.length, gap);
            }else{
                if(ar[begin] == 1)
                {
                    gap += 1;
                }
                ar = delete(ar, (begin + 1) % ar.length, gap);
            }
        }
        return ar;

    }

    public static int isOne(char[] chars) {
        int sum = 0;
        int index = -1;
        for(int i = 0; i < chars.length; ++i) {
            if (chars[i] == 1) {
                index = i;
            }
            sum += chars[i] == 1? 1 : 0;
            if(sum > 1)
                return -1;
        }
        return index;
    }
}
