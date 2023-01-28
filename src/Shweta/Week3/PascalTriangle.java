package Shweta.Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * Constraints:
 * 1 <= numRows <= 30
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        generate(numRows);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();

        // 0~4 -> 0
        for (int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for(int j=0; j<=i;j++){
                if(j==0 || j==i) {
                    innerList.add(1);
                }else{
                    int sum = outerList.get(i-1).get(j) +
                            outerList.get(i-1).get(j-1);
                    innerList.add(sum);
                }
            }
            outerList.add(innerList);
        }
        System.out.println(Arrays.deepToString(outerList.toArray()));
        return outerList;
    }
}
