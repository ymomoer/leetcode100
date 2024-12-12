class generateMatrix1 {
    public int[][] generateMatrix(int n){
        int[][] nums =new int[n][n];
        int startX = 0,startY = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;
        int i,j;

        while(loop<=n/2){
            for(j = startY;j<n-offset;j++){
                nums[startX][j]=count++;
            }
            for(i = startX;i<n-offset;i++){
                nums[i][j] = count++;
            }
            for(;j>startY;j--){
                nums[i][j] = count++;
            }
            for(;i>startX;i--){
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;  
        }
        if(n%2==1){
            nums[startX][startY] = count;
        }

       return nums;  
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generateMatrix1 Matrix = new generateMatrix1();
        int n = 5;
        int[][] result = Matrix.generateMatrix(n);
        printMatrix(result);
    }

}
