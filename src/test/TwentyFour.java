package test;

import java.util.Scanner;

/**
 * Created by mizeshuang on 2016/7/25.
 */
public class TwentyFour {
    private static int COUNT_NUMBER = 4;
    private static int TARGET = 24;

    private static double[] NUMBER = new double[COUNT_NUMBER];
    private static String[] EXPRESSION = new String[COUNT_NUMBER];


    public static boolean isTwentyFour(int n) {
        if (n == 1) {
            if (Math.round(NUMBER[0]) == TARGET) {
                return true;
            }
        }
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if (j < n) {
                double leftOPR, rightOPR;
                String leftEXP, rightEXP;

                leftOPR = NUMBER[i];
                rightOPR = NUMBER[j];

                for (int k = j; k < n - 1; k++) {
                    NUMBER[k] = NUMBER[k + 1];
                }

                leftEXP = EXPRESSION[i];
                rightEXP = EXPRESSION[j];
                for (int k = j; k < n - 1; k++) {
                    EXPRESSION[k] = EXPRESSION[k + 1];
                }

                EXPRESSION[i] = "(" + leftEXP + "+" + rightEXP + ")";
                NUMBER[i] = leftOPR + rightOPR;
                if (isTwentyFour(n - 1)) return true;

                EXPRESSION[i] = "(" + leftEXP + "-" + rightEXP + ")";
                NUMBER[i] = leftOPR - rightOPR;
                if (isTwentyFour(n - 1)) return true;


                EXPRESSION[i] = leftEXP + "*" + rightEXP;
                NUMBER[i] = leftOPR * rightOPR;
                if (isTwentyFour(n - 1)) return true;

                if (rightOPR != 0) {
                    EXPRESSION[i] = leftEXP + "/" + rightEXP;
                    NUMBER[i] = leftOPR / rightOPR;
                    if (isTwentyFour(n - 1))
                        return true;
                }


                for (int k = n - 1; k > j; k--) {
                    NUMBER[k] = NUMBER[k - 1];
                    EXPRESSION[k] = EXPRESSION[k - 1];
                }

                NUMBER[i] = leftOPR;
                NUMBER[j] = rightOPR;
                EXPRESSION[i] = leftEXP;
                EXPRESSION[j] = rightEXP;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < COUNT_NUMBER; i++) {
            Integer x;
            x = in.nextInt();
            NUMBER[i] = x;
            EXPRESSION[i] = x.toString();
        }
        System.out.println(isTwentyFour(COUNT_NUMBER));
        System.out.println(EXPRESSION[0]);
        System.out.println(NUMBER[0]);
    }
}
