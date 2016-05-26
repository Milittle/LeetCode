/**
 * Created by mizeshuang on 2016/5/25.
 */
public class Test342 {
    public static  boolean isPowerOfFour(int num) {
        if((num&(num-1))>0)
            return false;
        return (num&0x55555555)>0;
    }
}
