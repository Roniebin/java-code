package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 별찍기1 {
    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int s=n;
        int l=n;

        for(int i=1;i<n;i++){
            for(int j=l-1;j>0;j--){
                System.out.print(" ");
            }

            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            l-=1;

            System.out.print("\n");
        }

        for(int i=n;i>=1;i--){
            for(int j=s;j<=n-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }

           
            s-=1;
            System.out.print("\n");
        }
    
    }
    
}
