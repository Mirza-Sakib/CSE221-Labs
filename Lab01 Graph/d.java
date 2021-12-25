/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task03.pkg02;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class d {
     public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\input.txt");
        Scanner sc = new Scanner(file);
        
        int vertexQ = sc.nextInt();
        LinkedList[] list = new LinkedList[vertexQ];
        
        for(int i = 0; i < list.length; i++) {
            list[i] = new LinkedList();
        }
        
        while(sc.hasNextInt()) {
            list[sc.nextInt()].add(sc.nextInt());
        }
        
        for(int i = 0; i < list.length; i++) {
            list[i].sort(null);
            out.println(i+" - "+list[i].toString());
        }
    }
    
}
