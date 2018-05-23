package Tencent2018Spring;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Yilia on 2018/4/5.
 */
public class test2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int a = scanner.nextInt();
    int x = scanner.nextInt();
    int b = scanner.nextInt();
    int y = scanner.nextInt();

    solve(k ,a, x, b, y);

  }

  public static void solve(int k, int a, int x, int b, int y) {
    long[][] com = new long[101][101];
    if(k<a && k<b){
      System.out.println(0);
    }
    for (int i = 0; i <= 100; i++){
      com[0][i] = 0;
      com[i][0] = 1;
      com[i][i] = 1;
    }
    for (int i = 1; i <= 100; i++){
      for (int j = 1; j <= i/2; j++){
        com[i][j] = (com[i-1][j - 1] + com[i - 1][j])%1000000007;
        com[i][i - j] = com[i][j];
      }
    }

    int total = 0;
    for (int i = 1; i <= x; i++) {
      for (int j = 1; j <= y; j++) {
        if (i * a + j * b == k) {
          total += (com[x][i] * com[b][j]) % 1000000007;
          total %= 1000000007;
        } else if (i * a + j * b > k) {
          break;
        }
      }
    }

    System.out.println(total);







    int count = 0;

    for(int i = 0; i<=x; i++){
      for(int j = 0; j<=y; j++){
          if(k<(a*i+b*j)){
            break;
          }
          if(k == (a*i+b*j)){
            count++;
          }
      }
    }

    System.out.println(count%1000000007);
  }
}
