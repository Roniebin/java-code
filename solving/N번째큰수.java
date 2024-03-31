
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class N번째큰수{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testcase=Integer.parseInt(br.readLine());

        ArrayList<Integer>result=new ArrayList<Integer>();
        for(int i=0; i<testcase; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
           StringTokenizer st=new StringTokenizer(br.readLine());
           while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
           }
           Collections.sort(list,Collections.reverseOrder());

           result.add(list.get(2));
        }

        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }


    }
}