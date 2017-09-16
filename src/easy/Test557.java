package easy;

/**
 * 局部单词反转
 *
 * @Author mizes
 * @Create 2017-09-16 21:24
 */
public class Test557 {
    public static void main(String[] args) {
        String temp = "Let's take LeetCode contest";
        System.out.println(new S557().reverseWords(temp));
    }
}

class S557 {
    public String reverseWords(String s) {
        String[] splitString = s.split(" ");
        for(int i = 0; i < splitString.length; ++i) {
            StringBuffer stringBuffer = new StringBuffer(splitString[i]);
            for(int j = 0; j < splitString[i].length() / 2; ++j) {
                char t = stringBuffer.charAt(j);
                stringBuffer.setCharAt(j, stringBuffer.charAt(stringBuffer.length() - (j + 1)));
                stringBuffer.setCharAt(stringBuffer.length() - (j + 1), t);
            }
            splitString[i] = stringBuffer.toString();
        }
        String temp = "";
        for (int i = 0; i < splitString.length; ++i) {
            if(i != 0)
                temp += " ";
            temp += splitString[i];
        }
        return temp;
    }
}
