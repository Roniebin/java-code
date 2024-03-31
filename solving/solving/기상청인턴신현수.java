package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 기상청인턴신현수{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int num=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int max_sum=0;
        int count=0;
        ArrayList<Integer> sum=new ArrayList<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        StringTokenizer st1=new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            list.add(Integer.parseInt(st1.nextToken()));
        }

  
        for(int i=0;i<list.size()-(k-1);i++){
            int temp=0;
            for(int j=i;j<i+k;j++){
              temp+=list.get(j);   
            }
            sum.add(temp);
        }
    
        System.out.println(Collections.max(sum));
      

    }
}