package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class 새 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());

        int k=1;
        int count=0;

        while(n!=0){
            if(n-k<0){
                k=1;
                n-=k;
                k++;

            }else{
                n-=k;
                k++;
            }
           
            count++;
        }
        System.out.println(count);
    }
}
