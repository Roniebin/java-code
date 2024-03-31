package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 평균
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

      
        ArrayList<Double> result = new ArrayList<Double>();
        for(int i=0; i<t; i++){
            ArrayList<Double> list = new ArrayList<Double>();
            double avg=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            double sum=0;
            while(st.hasMoreTokens()){
                double score=Double.parseDouble(st.nextToken());
                sum+=score;
                list.add(score);
               
            }
            avg=sum/n;
            
            int count=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j)>avg){
                    count++;
                }
            }

            
            result.add(((double)count/n)*100);
        }
        for(int i=0;i<result.size();i++){
            System.out.println(String.format("%.3f",result.get(i))+"%");
            }

    }
}
