package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class 통계학 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());

        int [] arr=new int[n];

        int sum=0;

        for(int i=0;i<n;i++){
            int value=Integer.parseInt(br.readLine());
            arr[i]=value;
            sum+=value;
        }
        Arrays.sort(arr);

        boolean flag=false;
        int mode_max=0;
        int mode=10000;

        for (int i=0;i<n;i++){
            int jump=0; //동일한 수만큼 i를 jump
            int count=1;
            int i_value=arr[i];

            for(int j=i+1;j<n;j++){
                if(i_value!=arr[j]){
                    break;
                }
                count++;
                jump++;
            }

            if(count>mode_max){
                mode_max=count;
                mode=i_value;
                flag=true;
            }

            else if(count==mode_max && flag==true){
                mode=i_value;
                flag=false;
            }
            i+=jump;
        }

        System.out.println((int)Math.round((double)sum/n));
        System.out.println(arr[n/2]);    
        System.out.println(mode);    
        System.out.println(arr[n-1]-arr[0]); 
    }    
}
