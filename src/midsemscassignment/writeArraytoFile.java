package midsemscassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Akeel Muhammed
 */
public class writeArraytoFile {
    public writeArraytoFile(int[][] a, String filepath) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));
        PrintWriter writer = new PrintWriter(bw);
        //writer.println("Your answer is");
        //BufferedWriter bw1 = new BufferedWriter(new FileWriter(filepath, true));
        
        for(int i=0; i< a.length; i++){
            //bw.append('\n');
            
            for(int j=0; j<a[i].length; j++){
                writer.append(Integer.toString(a[i][j]));
                if(j<(a[i].length - 1))writer.append(',');
                //bw.append((char)a[i][j]);
                //bw.append(',');
            }
            writer.println();
            
        }
        writer.close();
        
    }
}

