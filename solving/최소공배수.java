package homework.solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 

public class 최소공배수 
{
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        
        for(int i=0; i<testcase; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            System.out.println(a*b/gcd(a,b));
        }
       


    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }else {
            return gcd(b,a%b);
        }
            
    }
}