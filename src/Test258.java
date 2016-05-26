/**
 * Created by mizeshuang on 2016/5/25.
 */
public class Test258 {
    public static void main(String[] args) {
        System.out.println(add(0));
    }

    public static int addDigits(int num) {
        if(num<10) return num;
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static int add(int num) {
        return (num - 1) % 9+1;
    }
}
