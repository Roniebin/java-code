package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class 수열의합{
    public static void main(String []args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());

        ArrayList<Integer> result=new ArrayList<Integer>();

        while(true){
            int a=(2*N/L-L*1+1)/2;

            if(L>100 || a<0){
                System.out.println("-1");
                break;
            }
           
            int sum=0;
            for(int i=a;i<a+L;i++){
                sum+=i;
                result.add(i);

            }
            if(sum!=N){
                result.clear();
                L++;
                
            }else {
                for(int i=0;i<result.size();i++){
                    System.out.print(result.get(i)+" ");
                }
                break;
            }
        }
    }
    
}