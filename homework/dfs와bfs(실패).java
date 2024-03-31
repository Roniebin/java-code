package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class dfs와bfs {
    public static void main(String[] args){
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

        String [] box=new String []{};

        try {
            box=r.readLine().split(" ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int node_num=Integer.parseInt(box[0]);
        int line_num=Integer.parseInt(box[1]);
        int start_node_num=Integer.parseInt(box[2]);

        ArrayList <String[]> links=new ArrayList<String[]>();

        for(int i=0;i<line_num;i++)
        {
            String[] s=new String[]{};
            try {
                s = r.readLine().split(" ");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            links.add(s);
        }

        for(int i=0;i<links.size();i++){
            System.out.println(Arrays.toString(links.get(i)));
        }

       
        //배열 정렬

         //dfs 먼저


    }
    
}
