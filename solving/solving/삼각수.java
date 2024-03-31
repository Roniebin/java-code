package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;
public class 삼각수 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        ArrayList <Integer> result=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st1.nextToken());
            result.add(W(s));
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static int T(int s){
        return (s*(s+1))/2;
    }
    public static int W(int s){
        int sum=0;
        
        for(int k=1;k<=s;k++){
            sum+=k*T(k+1);
        }
        return sum;
    }
}
