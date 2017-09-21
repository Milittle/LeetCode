package easy;

import java.util.ArrayList;

/**
 * 重定义矩阵的大小
 *
 * @Author mizes
 * @Create 2017-09-19 22:32
 * 4.63%效果不是特别好，需要改进
 * 主要是做了两次循环，考虑在一个循环里面做
 */
public class Test566 {
    public static void main(String[] args) {
        int[][] t = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 13}, {14, 15, 16, 17}};
        int[][] res = new S566().matrixReshape(t, 2, 8);

    }
}

class S566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int sourceSize = nums.length * nums[0].length;
        int[][] temp = new int[r][c];
        if(nums == null || r < 0 || c < 0)
        {
            return nums;
        }
        if (sourceSize != r * c) {
            return nums;
        }
        if(nums.length == r && nums[0].length == c)
        {
            return nums;
        }else
        {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0; i < nums.length; ++i) {
                for(int j = 0; j < nums[0].length; ++j) {
                    arrayList.add(nums[i][j]);
                }
            }
            for(int i = 0; i < r; ++i) {
                for(int j = 0; j < c; ++j) {
                    temp[i][j] = arrayList.get(i * c + j);
                }
            }
        }
        return temp;
    }
}
