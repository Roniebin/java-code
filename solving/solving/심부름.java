package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class 심부름 {
    public static void main(String arg[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int min=0;
        int sec=0;
        for(int i=0;i<4;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            sec+=a;
            if(sec>=60){
                min+=sec/60;
                sec=sec%60;
            }
            
        }

        System.out.println(min);
        System.out.println(sec);

     

    }
}
