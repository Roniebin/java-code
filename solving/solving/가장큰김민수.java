package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class 가장큰김민수{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
      
        for(int i=N;i>=4;i--){
            String s=String.valueOf(i);
            String[] a= s.split("");
            boolean yeah=false;
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[j].equals("4")|| a[j].equals("7")){
                    count++;
                }
            }
            if(count==a.length){
                yeah=true;
            }
            if(yeah){
                System.out.println(i);
                break;
            }
        }
    }
}