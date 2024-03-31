package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 최대곱 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int S=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        Integer[] p=new Integer[K];
        for(int i=0;i<p.length;i++){
            p[i]=S/K;
        }

        int pointer=p.length-1;
   
        while(true)
        {
            long sum=0;
            for(int i=0;i<p.length;i++){
                sum+=p[i];
            }
          
            if(sum==S){
                long result=1;
           
                for(int i=0;i<p.length;i++){
                    result*=p[i];
                }
                System.out.println(result);
                break;
            }else {
                if(pointer!=0){
                    p[pointer]++;
                    pointer--;
                }else {
                    pointer=p.length-1;
                }
              
            }

        }

    }
}
