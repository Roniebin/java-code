package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class solved {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int testcase=Integer.parseInt(st.nextToken());
        
        int []result1=new int[testcase];

        for(int i=0;i<testcase;i++) {
            StringTokenizer st1=new StringTokenizer(br.readLine());
           
            result1[i]=Integer.parseInt(st1.nextToken());
        }

        
        Arrays.sort(result1);
      
        int avg1=(int)Math.round(((float)testcase*((float)15/100)));

        int j=result1.length-1;
        for(int i=0;i<result1.length;i++) {
            if(avg1==0){
                break;
            }
            result1[i]=-1;
            result1[j]=-1;
            avg1--;
            j--;
        }
      
        int sum=0;
        int count=0;
        
        for(int i=0;i<result1.length;i++) {
            if(result1[i]!=-1){
                sum+=result1[i];
              
                count++;
            }
          
        }

        System.out.println(Math.round((float)sum/(float)count));
    }
}
