package homework;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 쉽게푸는문제 {
    public static void main(String[] args) {
        ArrayList<Integer>line=new ArrayList<Integer>();
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        String[] bs= new String[]{}; 
        int a=0;
        int b=0;
        try{
            bs= br.readLine().split(" ");
            a=Integer.parseInt(bs[0]);
            b=Integer.parseInt(bs[1]);
        }catch(Exception e){
    
        }
     
        for(int i=1;i<=b;i++){
            for(int j=1;j<=i;j++){
                line.add(i);
            }
        }
        int sum=0;
        for(int i=a-1;i<b;i++){
            sum+=line.get(i);
        }

        System.out.println(sum);
    }
    
   
}
