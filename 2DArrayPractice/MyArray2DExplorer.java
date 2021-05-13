
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray2DExplorer
{
    public MyArray2DExplorer()
    {
    }
    public boolean evenRow(int[][] mat, int row){
        boolean isEven = true;
        int sum = 0;
        for(int col = 0; col < mat[row].length; col++){
            int each = mat[row][col];
            if(each % 2 == 1){
                isEven = false;
            }
        }
        return isEven;
    }
    public boolean oddColSum(int[][] nums, int col){
        boolean oddSum = false;
        int sum = 0;
        for(int[] row : nums){
            sum += row[col];
        }
        if(sum % 2 == 1){
            oddSum = true;
        }
        return oddSum;
    }
    public int[] minRowPractice(int[][] nums){
        int min = nums[0][0];
        int rowNum = 0;
        int minRow = 0;
        for(int[] row : nums){
            for(int i = 0; i < row.length; i++){
                if(row[i] < min){
                    min = row[i];
                    minRow = rowNum;
                }
            }
            rowNum++;
        }
        return nums[minRow];
    }
    public int minRowAssignment(int[][] nums, int row){
        int min = nums[row][0];
        for(int i = 1; i < nums[row].length; i++){
            if(nums[row][i] < min){
                min = nums[row][i];
            }
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix){
        int[] maxs = new int[matrix[0].length];
        for(int row = 0; row < matrix[0].length; row++){
            int max = matrix[0][row];
            for(int col = 1; col < matrix.length; col++){
                if(matrix[col][row] > max){
                    max = matrix[col][row];
                }
            }
            maxs[row] = max;
        }
        return maxs;
    }
    public int[] allRowSums(int[][] data){
        int[] sums = new int[data.length];
        for(int row = 0; row < data.length; row++){
            int sum = 0;
            for(int col = 0; col < data[row].length; col++){
                sum += data[row][col];
            }
            sums[row] = sum;
        }
        return sums;
    }
    public double[] averageCol(int[][] nums){
        double[] averages = new double[nums[0].length];
        for(int row = 0; row < nums[0].length; row++){
            double avg = 0;
            for(int col = 0; col < nums.length; col++){
                avg += nums[col][row];
            }
            avg /= (double)nums.length;
            averages[row] = avg;
        }
        return averages;
    }
    public int smallEven(int[][] matrix){
        int min = matrix[0][0];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                int maybe = matrix[row][col];
                if(maybe % 2 == 0){
                    if(maybe < min){
                        min = maybe;
                    }
                }
            }
        }
        return min;
    }
    public static int biggestRow(int[][] nums){
        int bigRow = 0;
        int biggest = 0;
        for(int row = 0; row < nums.length; row++){
            int sum = 0;
            for(int col = 0; col < nums[row].length; col++){
                sum += nums[row][col];
                if(sum > biggest){
                    bigRow = row;
                    biggest = sum;
                }
            }
        }
        return bigRow;
    }
}
