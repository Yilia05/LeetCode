import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzhang46 on 2017/10/24.
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
public class No119_PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long rowIn = rowIndex+1;
        long res = 1;
        list.add(1);
        if(rowIndex == 0){
            return list;
        }
        for(int i = 1; i<=rowIndex; i++){
            res = (res * (rowIn - i)) / i;
            list.add((int)res);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getRow(12));
    }
}
