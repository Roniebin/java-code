package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 영화감독숌 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());

        int a=666;
        int count=1;
    
        while(count!=n){
            a++;

            if(String.valueOf(a).contains("666")){
                count++;
            }
        }

        System.out.println(a);
    }
    
}
