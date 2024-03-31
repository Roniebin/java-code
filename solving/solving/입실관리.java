package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
public class 입실관리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
       
        int n=Integer.parseInt(st.nextToken());

        ArrayList<String>b=new ArrayList<String>();
        for(int i=0; i<n; i++) {
            String[]a=br.readLine().split("");
            
            String s="";
            for(int j=0; j<a.length; j++){
                s+=a[j].toLowerCase();
            }
          b.add(s);
        }

        for(int i=0;i<b.size();i++){
            System.out.println(b.get(i));
        }
    }
}
