package Vijay.Week3;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) { //i = 2
            List<Integer> addList = new ArrayList<Integer>();
            for (int j = 0; j < (i + 1); j++) {
                if (j == 0 || j == i) {
                    addList.add(1);
                }
                else {
                    addList.add(result.get(i-1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
            result.add(addList);
        }

        return result;
    }
}
