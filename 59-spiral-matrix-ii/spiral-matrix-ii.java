class Solution {
    public int[][] generateMatrix(int n) {
        int sr=0,sc=0;
        int i=1;
        int ec=n-1,er=n-1;
        int[][] result = new int[n][n];

        while(i<=n*n){

            //Right
            for(int col=sc;col<=ec;col++){
                result[sr][col] = i++;
            }
            sr++;

            //Down
            for(int row=sr;row<=er;row++){
                result[row][ec]=i++;  
            }
            ec--;

            //bottom
            for(int col=ec;col>=sc;col--){
                result[er][col]=i++;
            }
            er--;

            //up
            for(int row=er;row>=sr;row--){
                result[row][sc]=i++;
            }
            sc++;
        }
        return result;
    }
}