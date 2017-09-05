
/*
* int数据的二进制格式的汉明距离计算
* */
public class Test461 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(8, 4));
    }
}
class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y;
        System.out.println(z);
        return bitCount(z);
    }

    public int bitCount(int n) {
        int i  = 0;
        while (n > 0) {
            if((n&1) == 1)
                i++;
            n = n >> 1;
        }
        return i;
    }
}
