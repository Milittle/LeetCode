import java.util.Stack;

public class Test657 {
    public static void main(String[] args) {
        S s = new S();
        System.out.println(s.judgeCircle("RLUDLLRR"));
    }
}

class S {
    int R = 0;
    int L = 0;
    int U = 0;
    int D = 0;
    public boolean judgeCircle(String moves) {
        for(int i =0; i < moves.length(); ++i) {
            switch (moves.charAt(i)) {
                case 'U':
                    U++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'R':
                    R++;
                    break;
                case 'L':
                    L++;
                    break;
            }
        }
        if(U == D && R == L)
        {
            return true;
        }
        return false;
    }
}
