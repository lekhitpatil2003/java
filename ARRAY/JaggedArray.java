package ARRAY;

public class JaggedArray {

    // 10 20 30
    // 40 50
    // 60 70 80 90
    public static void main(String[] args){
        // Step 1 : Define Array (Row Size)
        int [][] jagged = new int[3][];

        // Step 2 : Define col Size for each row 
        jagged[0] = new int [3];
        jagged[1] = new int [2];
        jagged[2] = new int [4];

        //Step 3 : insert Values in Array
        jagged[0][0] = 10;
        jagged[0][1] = 20;
        jagged[0][2] = 30;

        jagged[1][0] = 40;
        jagged[1][1] = 50;
        
        jagged[2][0] = 60;
        jagged[2][1] = 70;
        jagged[2][2] = 80;
        jagged[2][3] = 90;

        // Step 4 : Print Values 
        for(int i=0; i<jagged.length; i++){

            for(int j=0; j<jagged[i].length; j++){

                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }
    }
}
