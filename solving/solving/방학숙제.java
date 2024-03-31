package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class 방학숙제 {
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        double L=Double.parseDouble(st.nextToken());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        //A 국어
        double A=Double.parseDouble(st1.nextToken());
        StringTokenizer st2=new StringTokenizer(br.readLine());
        //B 수학
        double B=Double.parseDouble(st2.nextToken());
        StringTokenizer st3=new StringTokenizer(br.readLine());
        // 국어 c만큼
        double C=Double.parseDouble(st3.nextToken());
        StringTokenizer st4=new StringTokenizer(br.readLine());
        //수학 d만큼
        double D=Double.parseDouble(st4.nextToken());
        
        double a=Math.ceil(A/C);
            double b=Math.ceil(B/D);
       
        
        if(a>b){
           
            System.out.println((int)(L-a));
        }else{
            System.out.println((int)(L-b));
        }


        
    }
}
