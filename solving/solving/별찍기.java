package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 별찍기{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i; j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}