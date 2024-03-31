package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 한줄로서기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1= new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st1.nextToken());

        Integer[] result=new Integer[t];
        Integer[] result1=new Integer[t];
        int a=1;
        for(int i=0; i<t; i++){
            result1[i]=a;
            result[i]=-1;
            a++;
        }
       
        StringTokenizer st= new StringTokenizer(br.readLine());
        int c1=0;
    
        while(st.hasMoreTokens()){
            int c=Integer.parseInt(st.nextToken());
            int ad=c;
           
            while(true){
                int count=0;
        
                for(int i=0;i<c;i++){
                    if(result[i]==-1){
                        count++;
                    }
                }
                if(result[c]==-1&&count>=ad){
                   break;
                }
               
                c++;
            }
           
            result[c]=result1[c1];

            c1++;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
