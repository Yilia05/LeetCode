package HuaweiTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yzhang46 on 2018/3/28.
 * “QWERTYUIOPASDFGHJKLZXCVBNM”
 * “ABCDEFGHIJKLMNOPQRSTUVWXYZ”
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<Character> notLetter = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
            else {
                notLetter.add(s.charAt(i));
            }
        }

        HashMap<Character,Character> map = new HashMap<>();
        map.put('A', 'Q');
        map.put('B', 'W');
        map.put('C', 'E');
        map.put('D', 'R');
        map.put('E', 'T');
        map.put('F', 'Y');
        map.put('G', 'U');
        map.put('H', 'I');
        map.put('I', 'O');
        map.put('J', 'P');
        map.put('K', 'A');
        map.put('L', 'S');
        map.put('M', 'D');

        map.put('N', 'F');
        map.put('O', 'G');
        map.put('P', 'H');
        map.put('Q', 'J');
        map.put('R', 'K');
        map.put('S', 'L');
        map.put('T', 'Z');
        map.put('U', 'X');
        map.put('V', 'C');
        map.put('W', 'V');
        map.put('X', 'B');
        map.put('Y', 'N');
        map.put('Z', 'M');

        map.put('a', 'q');
        map.put('b', 'w');
        map.put('c', 'e');
        map.put('d', 'r');
        map.put('e', 't');
        map.put('f', 'y');
        map.put('g', 'u');
        map.put('h', 'i');
        map.put('i', 'o');
        map.put('j', 'p');
        map.put('k', 'a');
        map.put('l', 's');
        map.put('m', 'd');

        map.put('n', 'f');
        map.put('o', 'g');
        map.put('p', 'h');
        map.put('q', 'j');
        map.put('r', 'k');
        map.put('s', 'l');
        map.put('t', 'z');
        map.put('u', 'x');
        map.put('v', 'c');
        map.put('w', 'v');
        map.put('x', 'b');
        map.put('y', 'n');
        map.put('z', 'm');

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                sb.append(map.get(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
