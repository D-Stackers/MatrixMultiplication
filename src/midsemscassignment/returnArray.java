package midsemscassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Akeel Muhammed
 */
public class returnArray {
    public int[][] returnArrayFromFile(String filepath){
        String[] line = new String[10];
        int[][] element = new int[10][10];
        //ArrayList<ArrayList<Integer>> element = new ArrayList<ArrayList<Integer>>();
        int i = 0;
        int column = 0;
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)) ){
            
            while((line[i] = br.readLine()) != null){
                String[] elementsAsString = line[i].split(",");
                int j = 0;
                for(String x: elementsAsString ){
                    element[i][j] = Integer.parseInt(x);
                    //System.out.println(element[i][j]);
                    j++;
                }
                column =j;
                i++;
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }
        
        int[][] returnelement = new int[i][column];
        
        for(int k =0; k<i; k++){
            for(int l=0; l<column; l++){
                returnelement[k][l] = element[k][l];
            }
        }
        
        return returnelement;
    }
}
