package midsemscassignment;

import java.io.IOException;
/**
 * @author Akeel Muhammed
 */
public class MidSemSCAssignment {

    public static void main(String[] args) throws IOException {
        int[][] a;
        int[][] b;
        int[][] answerMatrix;
        returnArray ra = new returnArray();
        returnArray ra1 = new returnArray();
        a = ra.returnArrayFromFile(args[0]);
        b = ra1.returnArrayFromFile(args[1]);
        
        /*for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++ ){
                System.out.println(b[i][j]);
            }
        }*/
        //System.out.println(b.length);
        answerMatrix = matrixMult(a,b);
        writeArraytoFile af = new writeArraytoFile(answerMatrix, args[2]);
        
        for(int i=0; i<answerMatrix.length; i++){
            System.out.println();
            for(int j=0; j<answerMatrix[i].length; j++ ){
                System.out.print(answerMatrix[i][j] + "\t");
            }
        }
        
    }
    
    public static int[][] matrixMult(int m1[][], int m2[][]){
        int[][] result = new int[m1.length][m2[0].length];
        if (m1[0].length == m2.length){
        
            for(int column =0; column <m2[0].length; column++){
                for(int i=0; i<m1.length; i++){
                    for(int j=0; j<m2.length; j++){
                result[i][column] += m1[i][j] * m2[j][column];
                    }
                }
            }
        }else System.out.println("invalid dimension for  matrix multiplication");
        return result;
    }
    
}
