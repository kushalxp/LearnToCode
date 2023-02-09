package Shweta.Week4;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 * <p>
 * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
 * <p>
 * numberOfBoxesi is the number of boxes of type i.
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
 * <p>
 * Return the maximum total number of units that can be put on the truck.
 * <p>
 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
 * Output: 8
 * Explanation: There are:
 * - 1 box of the first type that contains 3 units.
 * - 2 boxes of the second type that contain 2 units each.
 * - 3 boxes of the third type that contain 1 unit each.
 * You can take all the boxes of the first and second types, and one box of the third type.
 * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 * <p>
 * Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
 * Output: 91
 * <p>
 * 1 <= boxTypes.length <= 1000
 * 1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
 * 1 <= truckSize <= 106
 */
public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        maximumUnits(boxTypes, truckSize);
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        int truckSizeSum = 0;
        int totalUnits = 0;
        // [1,3] row0col0 row0col1
        // [2,2] row1col0 row1col1
        // [3,1] row2col0 row2col1
        for (int row = 0; row < boxTypes.length; row++) {
            if (boxTypes[row][0] <= truckSize) {
                    System.out.println(row  + " :: " + boxTypes[row][0] + boxTypes[row][1]);
                    if (boxTypes[row][0] <= truckSize) {
                        truckSizeSum = truckSizeSum + boxTypes[row][0];
                    }
                    totalUnits = totalUnits + (boxTypes[row][0] * boxTypes[row][1]);
                    System.out.println(truckSizeSum + "::" + totalUnits);
//                for (int j = 0; j < boxTypes[row].length; j++) {
//                    if (truckSizeSum == truckSize) {
//                        return totalUnits;
//                    }
//                }
            }
        }
        System.out.print(Arrays.deepToString(boxTypes));
        System.out.println();
        System.out.println(truckSizeSum);
        return 0;
    }

}
