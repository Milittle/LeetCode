package test;

import java.util.Random;

/*
* 按照奇偶排序数组
* 奇数在前 偶数在后
* */
public class OddAndEven {
    public static void main(String[] args) {
        Random random = new Random(6);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(1000);
        }
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array) {
        int sign = 0;
        for(int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 1) {
                int temp = array[sign];
                array[sign] = array[i];
                array[i] = temp;
                ++sign;
            }
        }
    }
}
