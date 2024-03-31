package homework.solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 

public class 약수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int min=999999999;
        int max=-1;
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int c=Integer.parseInt(st.nextToken());
            if(min>c){
                min=c;
            }
            if(max<c){
                max=c;
            }
        }
        System.out.println(max*min);
    }
    
}
