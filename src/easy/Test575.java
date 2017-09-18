package easy;

import java.util.HashSet;

/**
 * 分配最多种类的糖果给妹妹
 *
 * @Author mizes
 * @Create 2017-09-18 22:30
 */
public class Test575 {
    public static void main(String[] args) {
        int[] t = {1, 2, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(new S575().distributeCandies(t));
    }
}


/**
* 思路可以使用hashset重新存储数据，如果大于当前数据的一半
* 那么妹妹是可以拿到一般那么多种糖果的
* 如果没有大于数据的一半
* 就只能拿到
* */
class S575 {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> temp = new HashSet<Integer>();
        for (int i : candies) {
            temp.add(i);
        }
        if (temp.size() >= candies.length / 2) {
            return candies.length / 2;
        } else {
            return temp.size();
        }
    }
}
