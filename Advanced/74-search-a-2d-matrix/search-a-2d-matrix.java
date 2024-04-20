class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Find the row to apply binary search 
        int rowToApplyBS = -1;
        int colLength = matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            if(target>= matrix[i][0] && target<= matrix[i][colLength]){
                rowToApplyBS = i;
                break;
            }
        }
        if(rowToApplyBS==-1) return false;

        int beg = 0;
        int end = matrix[rowToApplyBS].length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(matrix[rowToApplyBS][mid]==target){
                return true;
            }
            else if(matrix[rowToApplyBS][mid]<target) {
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}