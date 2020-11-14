
import java.util.Scanner;

/**
 * Queen's Attack II
 * 
 * === Horizon & Vertical === 
 * TOP: n - row_queen - (n - obs_row + 1)
 * LEFT: col_queen - 1 - obs_col
 * BOTTOM: row_queen - 1 - obs_row
 * RIGHT: n - col_queen - (n - obs_col + 1)
 * 
 * === Diagonal ===
 * TOP_LEFT: Math.min(n - row_queen, col_queen - 1) - (Math.min(n - obs_row, obs_col - 1) + 1)
 * TOP_RIGHT: Matn.min(n - row_queen, n - row_queen) - (Math.min(n - obs_row, n - obs_col) + 1)
 * BOTTOM_LEFT: Math.min(row_queen - 1, col_queen - 1) - (Math.min(obs_row - 1, obs_col - 1) + 1)
 * BOTTOM_RIGHT: Math.min(row_queen - 1, n col_queen) - (Math.min(obs_row - 1, n - obs_col) + 1)
 */
public class exam4 {

  static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    int res = 0;

    if (n == 1) {
      return 0;
    }

    System.out.println("N x N: " + n + ", QUEEN (" + r_q + ", " + c_q + ")");

    int[] obs = { 0, 0, 0, 0, 0, 0, 0, 0 };

    for (int i = 0; i < obstacles.length; i++) {
      int row = obstacles[i][0];
      int col = obstacles[i][1];
      
      if (Math.abs(r_q - row) == Math.abs(c_q - col)) {
        int cal_row = r_q - row;
        int cal_col = c_q - col;

        // Bottom Right Obstacle
        if (cal_row > 0 && cal_col < 0) {
          obs[7] = Math.max(Math.min(row - 1, n - col) + 1, obs[7]);
          System.out.println("Bottom Right: " + row + ", " + col + ": " + obs[4]);
          // Bottom Left Obstacle
        } else if (cal_row > 0 && cal_col > 0)  {
          obs[6] = Math.max(Math.min(row - 1, col - 1) + 1, obs[6]);
          // Top Right Obstacle
        } else if (cal_row < 0 && cal_col < 0)  {
          obs[5] = Math.max(Math.min(n - row, n - col) + 1, obs[5]);
          // Top Left Obstacle
        } else if (cal_row < 0 && cal_col > 0) {
          obs[4] = Math.max(Math.min(n - row, col - 1) + 1, obs[4]);
        }
      } else {
        // Horizontal Obstacle
        if (row == r_q && col != c_q) {
          // Left Obstacle
          if (c_q - col > 0)  {
            obs[1] = col;
            // Right Obstacle
          } else {
            obs[3] = n - col + 1;
          }
          // Vertical Obstacle
        } else if (row != r_q && col == c_q) {
          // Bottom Obstacle
          if (r_q - row > 0)  {
            obs[2] = row;
            // Top Obstacle
          } else {
            obs[0] = n - row + 1;
          }
        }
      }
    }

    System.out.println(
      "Obstacle TOP: " + obs[0] + ", LEFT: " + obs[1] + ", BOTTOM: " + obs[2] + 
      ", RIGHT: " + obs[3] + ", TOP LEFT: " + obs[4] + ", TOP RIGHT: " + obs[5] + 
      ", BOTTOM LEFT: " + obs[6] + ", BOTTOM RIGHT: " + obs[7]
    );

    int top = n - r_q;
    int left = c_q - 1;
    int bottom = r_q - 1;
    int right = n - c_q;
    int topLeft = Math.min(n - r_q, c_q - 1);
    int topRight = Math.min(n - r_q, n - c_q);
    int bottomLeft = Math.min(r_q - 1, c_q - 1);
    int bottomRight = Math.min(r_q - 1, n - c_q);
    
    System.out.println(
      "Top: " + top + ", Top-Left: " +  topLeft + 
      ", Left: " +  left + ", Bottom-Left: " +  bottomLeft + 
      ", Bottom: " +  bottom + ", Bottom-Right: " +  bottomRight + 
      ", Right: " +  right + ", Top-Right: " +  topRight);

    res = 
      top - obs[0] + topLeft - obs[4] + left - obs[1] + bottomLeft - obs[6] + 
      bottom - obs[2] + bottomRight - obs[7] + right - obs[3] + topRight - obs[5];

    return res;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // String[] nk = scanner.nextLine().split(" ");

    // int n = Integer.parseInt(nk[0]);

    // int k = Integer.parseInt(nk[1]);

    // String[] r_qC_q = scanner.nextLine().split(" ");

    // int r_q = Integer.parseInt(r_qC_q[0]);

    // int c_q = Integer.parseInt(r_qC_q[1]);

    // int[][] obstacles = new int[k][2];

    // for (int i = 0; i < k; i++) {
    //   String[] obstaclesRowItems = scanner.nextLine().split(" ");
    //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    //   for (int j = 0; j < 2; j++) {
    //     int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
    //     obstacles[i][j] = obstaclesItem;
    //   }
    // }

    int n = 100;
    int k = 100;

    int r_q = 48;
    int c_q = 81;

    int[][] obstacles = {
      {54, 87},
      {64, 97},
      {42, 75},
      {32, 65},
      {42, 87},
      {32, 97},
      {54, 75},
      {64, 65},
      {48, 87},
      {48, 75},
      {54, 81},
      {42, 81},
      {45, 17},
      {14, 24},
      {35, 15},
      {95, 64},
      {63, 87},
      {25, 72},
      {71, 38},
      {96, 97},
      {16, 30},
      {60, 34},
      {31, 67},
      {26, 82},
      {20, 93},
      {81, 38},
      {51, 94},
      {75, 41},
      {79, 84},
      {79, 65},
      {76, 80},
      {52, 87},
      {81, 54},
      {89, 52},
      {20, 31},
      {10, 41},
      {32, 73},
      {83, 98},
      {87, 61},
      {82, 52},
      {80, 64},
      {82, 46},
      {49, 21},
      {73, 86},
      {37, 70},
      {43, 12},
      {94, 28},
      {10, 93},
      {52, 25},
      {50, 61},
      {52, 68},
      {52, 23},
      {60, 91},
      {79, 17},
      {93, 82},
      {12, 18},
      {75, 64},
      {69, 69},
      {94, 74},
      {61, 61},
      {46, 57},
      {67, 45},
      {96, 64},
      {83, 89},
      {58, 87},
      {76, 53},
      {79, 21},
      {94, 70},
      {16, 10},
      {50, 82},
      {92, 20},
      {40, 51},
      {49, 28},
      {51, 82},
      {35, 16},
      {15, 86},
      {78, 89},
      {41, 98},
      {70, 46},
      {79, 79},
      {24, 40},
      {91, 13},
      {59, 73},
      {35, 32},
      {40, 31},
      {14, 31},
      {71, 35},
      {96, 18},
      {27, 39},
      {28, 38},
      {41, 36},
      {31, 63},
      {52, 48},
      {81, 25},
      {49, 90},
      {32, 65},
      {25, 45},
      {63, 94},
      {89, 50},
      {43, 41}
    };

    int result = queensAttack(n, k, r_q, c_q, obstacles);

    System.out.println(result);

    scanner.close();
    
  }
}