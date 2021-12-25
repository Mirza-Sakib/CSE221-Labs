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
public class b {
     public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\input.txt");
        Scanner sc = new Scanner(file);
        
        int vertexQ = sc.nextInt();
        
        int[][] matrix = new int[vertexQ][vertexQ];
        
        while(sc.hasNextInt()) {
            matrix[sc.nextInt()][sc.nextInt()] = 1;
        }
        
        System.out.println("  0 1 2 3 4 5");
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(i+" ");
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
}
     }
}

