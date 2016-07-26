package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizeshuang on 2016/7/23.
 */
public class Three {
    public static void main(String[] args) {
        List list = new Three().getExistThree(50);
        System.out.println(list);
    }

    public List getExistThree(int n) {
        List<Integer> integerList=new ArrayList<>();
        for (Integer i = 1; i <= n; i++) {
            if (i.toString().contains("3")) {
                integerList.add(i);
            }
        }
        return integerList;
    }

}
