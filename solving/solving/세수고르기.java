package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class 세수고르기 {
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
       
        int N=Integer.parseInt(st.nextToken());
        int S_size=Integer.parseInt(st.nextToken());

        StringTokenizer st1=new StringTokenizer(br.readLine());
        int [] S=new int [1002];
        for(int i=0;i<S_size;i++){
            int temp=Integer.parseInt(st1.nextToken());
            S[temp]=temp;
        }

        int min=999999999;
        

        for(int x=1;x<=1001;x++){
                if(x==S[x]){
                    continue;
                }
            
            for(int y=1;y<=1001;y++){

                if(y==S[y]){
                    continue;
                }
                for (int z=1;z<=1001;z++){

                    if(z==S[z]){
                        continue;
                    }
                    int xyz=x*y*z;
                    if(Math.abs(N-xyz)<min){
                        min=Math.abs(N-xyz);
                    }
                }
            }
        }
        System.out.println(min);
    }
}
