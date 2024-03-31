package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class 제곱수의합{
    public static void main(String[] args) throws Exception{
  
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());

        int[] result=new int[N+1];
        

        for(int i=1;i<=N;i++){
            result[i]=i;
            for(int j=1;j*j<=i;j++){
                result[i]=Math.min(result[i],result[i-j*j]+1);
            }
        }

     
        System.out.println(result[N]);
    }
}