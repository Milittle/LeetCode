package easy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * 数字报告
 *
 * @Author mizes
 * @Create 2017-09-22 8:26
 */
public class Test412 {
    public static void main(String[] args) {
        int n = 15;
        List<String> t = new S412().fizzBuzz(n);
        for (String i : t) {
            System.out.println(i);
        }
    }
}


class S412 {
    int size = 0;
    public List<String> fizzBuzz(int n) {

        size = n;
        AbstractList<String> t = new AbstractList<String>() {

            @Override
            public String get(int index) {
                int i = index + 1;
                String res = i % 5 == 0 ?
                        (i % 3 == 0 ? "FizzBuzz" : "Fizz")
                        :
                        (i % 3 == 0 ? "Buzz" : String.valueOf(i));
                return res;
            }

            @Override
            public int size() {
                return S412.this.size;
            }
        };

        return t;

        /*List<String> t = new ArrayList<>();
        for(int i = 1; i <= n; ++i) {
            if (isMutiplesOfFive(i) && isMutiplesOfThree(i)) {
                t.add("FizzBuzz");
            } else if (isMutiplesOfThree(i)) {
                t.add("Fizz");
            } else if (isMutiplesOfFive(i)) {
                t.add("Buzz");
            } else {
                t.add(String.valueOf(i));
            }
        }
        return t;*/
    }

    public boolean isMutiplesOfThree(int i) {
        return i % 3 == 0;
    }

    public boolean isMutiplesOfFive(int i) {
        return i % 5 == 0;
    }
}