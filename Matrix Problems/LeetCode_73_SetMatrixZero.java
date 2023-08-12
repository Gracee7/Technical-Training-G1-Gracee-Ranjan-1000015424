public class LeetCode_73_SetMatrixZero {
    public static void rowZero(int[][] matrix,int[][] flag,int row,int col){
        for(int i=0;i<matrix[0].length;i++){
            if(i==col || matrix[row][i]==0){
                continue;
            }           
            else{
                matrix[row][i]=0;
                flag[row][i]=1;
            }
            
        }
    }

    public static void colZero(int[][] matrix,int[][] flag,int row,int col){
        for(int i=0;i<matrix.length;i++){
            if(i==row || matrix[i][col]==0){
                continue;
            }           
            else{
                matrix[i][col]=0;
                flag[i][col]=1;
            }
            
        }
    }

    public static void setZeroes(int[][] matrix) {
        int[][] flag = new int[matrix.length][matrix[0].length];
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j]==0 && flag[i][j]==0){
                    rowZero(matrix,flag,i,j);
                    colZero(matrix,flag,i,j);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int[] i: matrix){
            System.out.println();
            for(int j : i){
                System.out.print(" "+ j);
            }
        }
    }
}
