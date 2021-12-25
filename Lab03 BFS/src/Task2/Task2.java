package Task2;
//@author 18101142

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Task2 {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File f = new File("‪C:\\Users\\Admin\\Desktop\\Graph.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String s = b.readLine();
        int n = Integer.parseInt(s);
        int[][] g = new int[n + 1][n + 1];
        //undirected (a)
        //string to int
        while ((s = b.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s, " ");
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            g[t1][t2] = 1;
            g[t2][t1] = 1;
        }
        bfs(g,1);
    }

    public static void bfs(int[][] a, int s) {
        String[] color = new String[a.length];
        int[] level = new int[a.length];
        int[] parent = new int[a.length];
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i < a.length; i++) {
            color[i] = "white";
            level[i] = 9999999;
            parent[i] = -1;
        }

        color[s] = "gray";
        level[s] = 0;
        parent[s] = -1;
        
        q.add(s);
        
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 1; i < a.length; i++) {
                if (a[u][i] == 1 && color[i].equals("white")) {
                    color[i] = "gray";
                    level[i] = level[u] + 1;
                    parent[i] = u;
                    q.add(i);
                }
            }

            color[u] = "black";

        }

        print(parent, level);

    }

    public static String direction(int[] parent, int i) {
        String s = "";
        int temp = i;
        while (parent[i] != -1) {
            String q = "" + parent[i];
            s = q + ", " + s;
            i = parent[i];
        }
        s = s + temp;
        return s;

    }

    public static void print(int[] p, int[] d) {
        for (int i = 1; i < p.length; i++) {
            System.out.println(i + " : level from the source - " + d[i] + ", path -> " + direction(p, i));
        }
    }
}
