/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task03.pkg02;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class f {
      
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\input.txt");
        Scanner sc = new Scanner(file);
        
        int vertexQ = sc.nextInt();
        int[] inDegree = new int[vertexQ];
        int[] outDegree = new int[vertexQ];
        
        while(sc.hasNextInt()) {
            outDegree[sc.nextInt()]++;
            inDegree[sc.nextInt()]++;
        }
        
        for(int i = 0; i < vertexQ; i++) {
            out.println(i+" - "+outDegree[i]+" / "+inDegree[i]);
        }
    }
    
}
