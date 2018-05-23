package NengYuan;
import java.io.Serializable;
import java.util.Scanner;

public class SortString implements Serializable{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext())
    {
      String input = in.nextLine();
      int length = input.length();
      char[] array = input.toCharArray();
      char[] temp = new char[length];
      int k = 0;
      for(int i = 0; i<26; i++)
      {
        for(int j = 0; j<length; j++)
        {
          if(array[j] - 'a' == i || array[j] - 'A' == i)
          {
            temp[k] = array[j];
            k++;
          }
        }
      }
      k = 0;
      for(int i = 0; i<length; i++)
      {
        if(array[i] >= 'a' && array[i] <= 'z' || array[i] >= 'A' && array[i] <= 'Z')
        {
          array[i] = temp[k++];
        }
      }
      System.out.println(String.valueOf(array));
    }
  }
}