package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class 세수정렬 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        Integer[] line=new Integer [3];
        
        line[0]=Integer.parseInt(st.nextToken());
        line[1]=Integer.parseInt(st.nextToken());
        line[2]=Integer.parseInt(st.nextToken());
        
        Arrays.sort(line);
        System.out.print(line[0]+" ");
        System.out.print(line[1]);
        System.out.print(line[2]);
    }
}
