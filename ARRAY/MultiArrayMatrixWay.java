package ARRAY;

public class MultiArrayMatrixWay {
    public static void main(String[] args) {
        int [][] matrix = new int[3][];
        matrix [0] = new int[3];
        matrix [1] = new int[2];
        matrix [2] = new int[4];
        
        matrix[0][0]=10;
        matrix[0][1]=20;
        matrix[0][2]=30;

        matrix[1][0]=40;
        matrix[1][1]=50;

        matrix[2][0]=60;
        matrix[2][1]=70;
        matrix[2][2]=80;
        matrix[2][3]=90;


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}