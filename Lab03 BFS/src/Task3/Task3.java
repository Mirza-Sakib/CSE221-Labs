/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author SHOVON
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Task3 {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Admin\\Desktop\\maldives.txt");
        BufferedReader b = new BufferedReader(new FileReader(file));
        String s = b.readLine();
        int n = Integer.parseInt(s);
        int g[][] = new int[5][5];

        while ((s = b.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s, " ");
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            g[t1][t2] = 1;
            g[t2][t1] = 1;
        }
        BFS(g, 1, n, 3, 4);
    }

    public static void BFS(int a[][], int s, int n, int a1, int a2) {
        String[] color = new String[a.length];
        int[] level = new int[a.length];
        int[] parent = new int[a.length];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            color[i] = "white";
            level[i] = 0;
            parent[i] = -1;
        }
        color[s] = "gray";
        level[s] = 0;
        parent[s] = -1;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.remove();
            for (int j = 0; j < a.length; j++) {
                if (a[u][j] == 1 && color[j].equals("white")) {
                    color[j] = "gray";
                    level[j] = level[u] + 1;
                    parent[j] = u;
                    q.add(j);
                }
            }
            color[u] = "black";
        }
        print(parent, level, n, a1, a2);
    }

    public static String level(int[] parent, int i) {
        String s = "";
        int temp = i;
        while (parent[i] != -1) {
            String q = ""+parent[i];
            s = q + " --> " + s;
            i = parent[i];
        }
        s = s + temp;
        return s;

    }

    public static void print(int[] p, int[] d, int n, int a1, int a2) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Test Case: " + i + "\nTotal Bridges: " + d[a1] + "\nPath: " + level(p, a1));
            a1 = a2;
        }
    }

}
