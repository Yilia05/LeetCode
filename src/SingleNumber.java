/**
 * Created by Yilia on 2018/5/22.
 */
public class SingleNumber {
  // 只出现一次的一个数
  public static int singleNumber1(int[] A) {
    int res=0;
    for(int i=0;i<A.length;i++)
      res^=A[i];
    return res;
  }

  // 只出现一次的两个数
  public static  int[] singleNumber2(int[] A) {
    int sum = singleNumber1(A);
    int[] res = new int[2];
    int temp = findOne(sum);
    for (int i = 0; i < A.length; i++) {
      if((A[i]&temp)!=0){
        res[0]^=A[i];
      }else
        res[1]^=A[i];
    }
    return res;
  }

  public static int findOne(int sum){
    return sum&~(sum-1);
  }

  // 只出现一次的三个数
  public static  int[] singleNumber3(int[] A) {
    int[] res = new int[3];
    int[] A1 = new int[A.length-1];
    int x = singleNumber1(A);
    int m=0;
    int[] value = new int[2];
    for (int i = 0; i < A.length; i++) {
      A[i] = A[i]^x;
      m ^= findOne(A[i]);
    }

    m = findOne(m);

    // 根据A[i]的第m位是否为1，分组（1，0，0）
    for (int i = 0; i < A.length; i++) {
      if((A[i]&m)!=0){
        res[2]^=A[i];
      }
    }

    //移除那个数
    for (int i = 0,j=0; i < A.length; i++) {
      if(A[i] != res[2]){
        A1[j] = A[i];
        j++;
      }
    }
    res[2] = res[2]^x;
    value = singleNumber2(A1);
    for (int i = 0; i < 2; i++) {
      res[i] = value[i]^x;
    }
    return res;
  }


}
