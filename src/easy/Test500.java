package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 查看一个单词是否在用键盘的一行打出
 *
 * @Author mizes
 * @Create 2017-09-15 19:34
 */
public class Test500 {
    public static void main(String[] args) {
        String[] test = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ouput = new S500().findWords(test);
        for (String i : ouput) {
            System.out.println(i);
        }
    }
}

class S500 {
    String[] keyBoardList = new String[3];

    public S500() {
        keyBoardList[0] = ("qwertyuiop");
        keyBoardList[1] = ("asdfghjkl");
        keyBoardList[2] = ("zxcvbnm");
    }

    public String[] findWords(String[] words) {
        ArrayList<String> temp = new ArrayList<>();
        int size = 0;
        for(int i = 0; i < words.length; ++i) {
            for(int j = 0; j < keyBoardList.length; ++j) {
                for(int z = 0; z < words[i].length(); ++z) {
                    String te = words[i].toLowerCase();
                    if (keyBoardList[j].contains(String.valueOf(te.charAt(z)))) {
                        size += 1;
                    }
                }
                if (size == words[i].length()) {
                    temp.add(words[i]);
                    size = 0;
                    break;
                }
                size = 0;
            }
        }
        return temp.toArray(new String[0]);
    }
}
