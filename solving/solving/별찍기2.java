package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 별찍기2{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());

        int s=1;

        while(true){
            if(s==n+1){
                break;
            }
            for(int i=0;i<s;i++){
                System.out.print("*");
            }
            System.out.print("\n");
            s++;
        }
        while(true){
            if(s==2){
                break;
            }
            for(int i=s;i>2;i--){
                System.out.print("*");
            }
            System.out.print("\n");
            s--;
        }
    }
}