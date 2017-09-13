/**
 * 数组划分
 *
 * @Author mizes
 * @Create 2017-09-13 12:15
 */
public class Test561 {
    public static void main(String[] args) {
        int[] items = {1, 2, 3, 2};
        S561 s561 = new S561();
        System.out.println(s561.arrayPairSum(items));
    }

}

class S561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        quickSort(nums, 0, nums.length - 1);
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public void sort(int[] nums) {
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    nums[j] = nums[j] ^ nums[j - 1];
                    nums[j - 1] = nums[j] ^ nums[j - 1];
                    nums[j] = nums[j] ^ nums[j - 1];
                }
            }
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        int temp, i, j;
        if (left < right) {
            i = left;
            j = right;
            temp = a[i];
            do {
                while (a[j] > temp && i < j) {
                    j--;
                }
                if (i < j) {
                    a[i] = a[j];
                    i++;
                }
                while (a[i] < temp && i < j) {
                    i++;
                }
                if (i < j) {
                    a[j] = a[i];
                    j--;
                }
            } while (i != j);
            a[i] = temp;
            quickSort(a, left, i - 1);
            quickSort(a, j + 1, right);
        }
    }
}
