package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
public class 제로 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int testcase =Integer.parseInt(st.nextToken());

        ArrayList<Integer>result=new ArrayList<>();
        int sum=0;
        for(int i=0; i<testcase; i++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st1.nextToken());

            if(n==0){
                result.remove(result.size()-1);
            }else{
                result.add(n);
            }
        }
        for(int i=0; i<result.size(); i++){
            sum+=result.get(i);
        }
        
        System.out.println(sum);
    }
}
