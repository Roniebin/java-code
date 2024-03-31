package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class 고층건물 {
    static int n;
    static int [] building;
    static int [] result;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());

        StringTokenizer st1=new StringTokenizer(br.readLine());
        building=new int[n];
        result=new int[n];

        for(int i=0;i<n;i++){
            building[i]= Integer.parseInt(st1.nextToken());
        }
            
        count();
      
        Arrays.sort(result);
        System.out.println(result[result.length-1]);
    }
    public static void count(){
        for(int i=0;i<n-1;i++){
            result[i]++;
            result[i+1]++;
            double slope=building[i+1]-building[i];
            for(int j=i+2;j<n;j++)
            {
                double nextslope=(double)(building[j]-building[i])/(j-i);
                if(nextslope<=slope){
                    continue;
                }
                slope=nextslope;
                result[i]++;
                result[j]++;
            }
        }

    }
}
