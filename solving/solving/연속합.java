package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연속합 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int max=0;
        int [] bucket=new int[n];
        int [] dp=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            bucket[i]=Integer.parseInt(st.nextToken());
        }

        dp[0]=bucket[0];
        max=bucket[0];

        for(int i=1;i<n;i++){
            if(dp[i-1]+bucket[i]>=bucket[i]){
                dp[i]=dp[i-1] +bucket[i];
            }else{
                dp[i]=bucket[i];
            }

            if(dp[i]>max){
                max=dp[i];
            }
        }

        System.out.println(max);


        
    }
}
