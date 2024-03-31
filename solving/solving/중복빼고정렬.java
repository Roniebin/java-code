package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;



public class 중복빼고정렬 {
    
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<Integer> new_data = new ArrayList<Integer>();
        String [] aa=br.readLine().split(" ");
        for(int i=0;i<N;i++) {
            data.add(Integer.parseInt(aa[i]));
        }

        for(int i=0;i<N;i++) {
            if(!new_data.contains(data.get(i))){
                new_data.add(data.get(i));
            }
        }

        Collections.sort(new_data);
        for(int i=0;i<new_data.size();i++){

            System.out.print(new_data.get(i)+" ");
          
        }
    }
    
  
}
