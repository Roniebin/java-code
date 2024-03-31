package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 럭비 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        
        
        ArrayList<String> result=new ArrayList<String>();

        while(true){
            String [] b=br.readLine().split(" ");
            if(b[0].equals("#")){
                break;
            }

            if(Integer.parseInt(b[1])>17 || Integer.parseInt(b[2])>=80){
                result.add(b[0]+" Senior");
            }else{
                result.add(b[0]+" Junior");
            }
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
