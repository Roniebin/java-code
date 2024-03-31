package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 숫자정사각형 {
    public static void main(String[] args){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=0;
        int M=0;
        try {
            String []f =br.readLine().split(" ");
            N=Integer.parseInt(f[0]);
            M=Integer.parseInt(f[1]);
          
        } catch (NumberFormatException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        String a="";
        ArrayList <String> list = new ArrayList<String>();

        try {
            for(int i=0;i<N;i++){
                a=br.readLine();
                list.add(a);
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        }

        int size=0;
        if(N>M){
            size=M;
        }else {
            size=N;
        }
        boolean done=false;
        for(int s=size;s>-1;s--)
        {
            if(done){
                break;
            }
            for(int i=0;i<N-s+1;i++){   //행
                if(done){
                    break;
                }
                for(int j=0;j<M-s+1;j++){       //열
                    if(done){
                        break;
                    }
                    if(list.get(i).charAt(j)==list.get(i).charAt(j+s-1)&&list.get(i).charAt(j+s-1)==list.get(i+s-1).charAt(j)&&list.get(i+s-1).charAt(j)==list.get(i+s-1).charAt(j+s-1)&&list.get(i+s-1).charAt(j+s-1)==list.get(i).charAt(j)){
                        System.out.println(s*s);
                        done=true;
                        break;
                    }
                }
            }
        }
    }
}
