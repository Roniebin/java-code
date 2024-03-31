package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 영수증{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int price=0;

        for(int i=0;i<n;i++){
            
            int temp=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            temp=Integer.parseInt(st.nextToken());
            temp*=Integer.parseInt(st.nextToken());
            price+=temp;
        }

        if(price!=sum){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}