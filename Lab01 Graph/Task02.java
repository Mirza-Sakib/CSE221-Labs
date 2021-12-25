/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class Task02 {
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("‪‪C:\\Users\\Admin\\Desktop\\input.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }   
}


