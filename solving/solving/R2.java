package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class R2
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
      
        int R1=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        
        System.out.println(2*S-R1);
        

    }
}