package homework.solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 분산처리 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=0;

        ArrayList<Integer[]> lines=new ArrayList<Integer[]>();
        try{
            testcase=Integer.parseInt(br.readLine());
            
            for(int i=0;i<testcase;i++){
                String[] c=br.readLine().split(" ");
                Integer[] cc=new Integer[]{Integer.parseInt(c[0]), Integer.parseInt(c[1])};
                lines.add(cc);
            }
            
        }catch(Exception e){

        }

        ArrayList<Integer>num=new ArrayList<Integer>();
        for(int i=0;i<lines.size();i++){
            int ccc=lines.get(i)[0];
            int temp=1;
           
            for(int j=0;j<lines.get(i)[1];j++){
                    temp=(temp*ccc)%10;
            }
            if(temp==0){
                temp=10;
            }
            num.add(temp);
            
         
        }
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

    }
}
