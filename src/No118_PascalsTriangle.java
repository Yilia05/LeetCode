import java.util.ArrayList;
import java.util.List;
/**
 * Created by yzhang46 on 2017/10/23.
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class No118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j){
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            }
            pre = row;
            res.add(row);
        }
        return res;
    }
}
