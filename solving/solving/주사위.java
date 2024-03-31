package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 주사위 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int r1=Integer.parseInt(st.nextToken());
        int r2=Integer.parseInt(st.nextToken());
        int r3=Integer.parseInt(st.nextToken());

        if(r1==r2 && r2==r3 && r3==r1){
            System.out.println(10000+(r1*1000));
        }else if((r1==r2 && r2!=r3)|| (r1!=r2 && r2==r3)||(r1==r3 && r3!=r2) ){
            if((r1==r2 && r2!=r3)){
                System.out.println(1000+(r1*100));
            }else if(r1!=r2 && r2==r3)
            {
                System.out.println(1000+(r2*100));
            }else if(r1==r3 && r3!=r2){
                System.out.println(1000+(r1*100));
            }
           
        }else {
            int temp=Math.max(r1,r2);
            if(temp>r3){
                System.out.println(temp*100);
            }else {
                System.out.println(r3*100);
            }
        }
    }
    
}
