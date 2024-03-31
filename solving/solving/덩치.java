package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
public class 덩치 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int t=Integer.parseInt(st.nextToken());

        ArrayList<String[]> l=new ArrayList<String[]>();
        int [] result=new int [t];

        for(int i=0;i<t;i++){
            String [] s=br.readLine().split(" ");
            l.add(s);
            result[i]=1;
        }


        for(int i=0;i<t;i++)
        {
            for(int j=i+1;j<t;j++){
                //뒷사람이 키가 더큼
                if(Integer.parseInt(l.get(i)[0])<Integer.parseInt(l.get(j)[0])){
                    //뒷사람이 몸무게도 크거나 같음음
                    if(Integer.parseInt(l.get(i)[1])<Integer.parseInt(l.get(j)[1])){
                        result[i]+=1;
                    }
                    // 앞사람이 몸무게가 더 큼
                }//앞사람이 키가 같거나 더큼
                else if (Integer.parseInt(l.get(i)[0])>Integer.parseInt(l.get(j)[0])){
                    if(Integer.parseInt(l.get(i)[1])>Integer.parseInt(l.get(j)[1])){
                        result[j]+=1;
                    }
                }
            }
        }
        
        for(int i=0;i<result.length;i++){
            
            if(i==result.length-1){
                System.out.print(result[i]);
            }else{
                System.out.print(result[i]+" ");
            }
        }



    }
    
}
