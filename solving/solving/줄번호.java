package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
public class 줄번호{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());

        ArrayList<String>result=new ArrayList<String>();
        for(int i=0;i<a;i++){
            String s=br.readLine();
            result.add(s);
        }

        for(int i=0;i<result.size();i++){
            System.out.println(i+1+". "+result.get(i));
        }

    }
}