package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class t {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());


        StringTokenizer st1=new StringTokenizer(br.readLine());
        int K=Integer.parseInt(st1.nextToken());
        int X=Integer.parseInt(st1.nextToken());

        int min=0;
        int max=0;

        if(K-X<0){
            min=0;
        }else{
            min=K-X;
        }

        if(K+X>=10000){
            max=10000;
        }else{
            max=K+X;
        }

        if(max<A){
            System.out.println("IMPOSSIBLE");
        }
        else if(min>B){
            System.out.println("IMPOSSIBLE");
        }
        else if(A>=min && B>=max){
            System.out.println(K-A+max-K+1);
        }
        else if(A>=min && B<=max){
            System.out.println(K-A+B-K+1);
        }
        else if(A<=min && B<=max){
            System.out.println(K-min+B-K+1);
        }else if(A<=min && B>=max){
            System.out.println(K-min+max-K+1);
        }
       
    }
}
