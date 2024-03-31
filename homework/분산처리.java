package java;
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

        ArrayList<String>num=new ArrayList<String>();
        for(int i=0;i<lines.size();i++){
            int ccc=lines.get(i)[0];
            int count=-1;
            int temp=ccc;
            while(true)
            {
                count++;
                if(count!=lines.get(i)[1]){
                    temp*=ccc;
                    while(true)
                    {
                        if(!(temp<10)){
                            temp/=10;
                        }
                    }
                }else {
                    System.out.println(count);
                    break;
                }
                
            }
        }

    }
}
