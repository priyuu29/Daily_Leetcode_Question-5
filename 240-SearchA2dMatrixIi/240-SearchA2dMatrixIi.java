// Last updated: 8/13/2025, 10:26:05 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Staircae(matrix, target);
    }
    public static boolean Staircae(int [][] arr, int target){
        int row=0;
        int col=arr[0].length-1;
        while(col>=0 && row<arr.length){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}