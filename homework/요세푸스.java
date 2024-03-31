package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 요세푸스
{
    public static void main(String[] args){
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        
        String []ex=new String []{};
        try {
            String ex1=br1.readLine();
            ex=ex1.split(" ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int N=Integer.parseInt(ex[0]);
        int term=Integer.parseInt(ex[1]);
        int idx=term-1;

        ArrayList <Integer> ex2=new ArrayList<Integer>();
        for(int i=1;i<=N;i++)
        {
            ex2.add(i);
        }
        int count2=0;
       
        String result="<";
        while(true)
        {
            result+=ex2.get(idx)+", ";
            ex2.remove(idx);
            count2++;
            ex2.add(idx,-1);
          
            for(int i=0;i<term;i++){
                idx++;
                if(idx%N==0){
                    idx=0;
                }
                int count3=0;
                while(true)
                {
                    if(ex2.get(idx)!=-1){
                        break;    
                    }else { 
                        idx++;
                        if(idx%N==0){
                            idx=0;
                        }
                        count3++;
                        if(count3==N)
                        {
                            break;
                        }
                    }
                   
                }
             
            }
           
            if(count2==N){
                break;
            }
           
        }
        result=result.substring(0,result.length()-2);
        result+=">";

        System.out.println(result);
       
    }
}