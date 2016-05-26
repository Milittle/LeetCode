import java.util.ArrayList;

/**
 * Created by mizeshuang on 2016/5/25.
 */
public class Test338 {
    public static void main(String[] args) {

    }

    public static int[] countBits(int num) {
        int[] list;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        for (int i = 1; i <= num; i++) {
            arrayList.add(arrayList.get(i & (i - 1)) + 1);
        }
        list = new int[arrayList.size()];
        for (int i = 0; i < list.length; i++) {
            list[i] = arrayList.get(i);
        }
        return list;
    }
}
