package Vishal.Week3;

import java.util.Arrays;
import java.util.List;

public class PascalTriangle
{
    public List<List<Integer>> generate(int numRows) {
        int[][] arr = new int[numRows][];
        for (int i = 0; i < numRows; i++){
            int[] currRow = new int[i + 1];
            currRow[0] = 1;
            currRow[i] = 1;
            for (int j = 1; j < i; j++){
                currRow[j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i] = currRow;
        }
        return (List) Arrays.asList(arr);
    }
}
