package easy;

/**
 * 计算岛的长度
 *
 * @Author mizes
 * @Create 2017-09-23 9:49
 */
public class Test463 {
    public static void main(String[] args) {
        int[][] i = {{0,1,0,0},
                     {1,1,1,0},
                     {0,1,0,0}};
        System.out.println(new S463().islandPerimeter(i));
    }
}

class S463 {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    if (i > 0) {
                        if (grid[i - 1][j] == 1) {
                            sum -= 1;
                        }
                    }
                    if (i < grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            sum -= 1;
                        }
                    }
                    if (j > 0) {
                        if (grid[i][j - 1] == 1) {
                            sum -= 1;
                        }
                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j + 1] == 1) {
                            sum -= 1;
                        }
                    }
                }
            }
        }
        return sum;
    }
}