package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
public class 괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int testcase=Integer.parseInt(st.nextToken());

        ArrayList <String> result=new ArrayList<>();
        for(int i=0; i<testcase; i++){
            String[] temp=br.readLine().split("");

            int open_count=0;
            boolean done=false;
            for(int j=0;j<temp.length;j++){
                if(temp[j].equals("(")){
                    open_count++;
                }else if(temp[j].equals(")")){
                    if(open_count==0){
                        result.add("NO");
                        done=true;
                        break;
                    }else {
                        open_count--;
                    }
                   
                }
            }
            if(done==false){
                if(open_count==0){
                    result.add("YES");
                }else if(open_count>0){
                    result.add("NO");
                }else{
                    result.add("NO");
                }
            }
            
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
       
    }
}
