import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int[] a = new int[10];
        char[] c = s.toCharArray();
        int min = Integer.MAX_VALUE;
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            a[i]=0;
        }
        for (int i = 0; i < c.length; i++) {
            a[c[i]-'0']++;
        }
        for (int i = 1; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
                flag = i;
            }
        }
        int zeros = a[0];
        StringBuffer buffer = new StringBuffer();
        if(min <= zeros){

            for (int i = 0; i <= min; i++) {
                buffer.append(flag);
            }
        }
        else{

            buffer.append(flag);
            for (int i = 0; i <= a[0]; i++) {
                buffer.append(0);
            }
        }

        System.out.println(buffer);

    }



}