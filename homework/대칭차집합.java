package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 대칭차집합{
    public static void main(String[] args){
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

        int N=0;
        int M=0;

        String [] A=new String[]{};
        String [] B=new String[]{};
        try{
            String []line=r.readLine().split(" ");
            N=Integer.parseInt(line[0]);
            M=Integer.parseInt(line[1]);
            A=r.readLine().split(" ");
            B=r.readLine().split(" ");

        }catch(Exception e){
            System.out.println("예외발생");
        }

        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(!A[i].equals(B[j])){
                    if(j==B.length-1){
                      count++; 
                    }
                }else {
                    break;
                }
            }
        }
        for(int i=0;i<B.length;i++){
            for(int j=0;j<A.length;j++){
                if(!B[i].equals(A[j])){
                    if(j==A.length-1){
                     count++;  
                    }
                }else{
                    break;
                }
            }
        }

        System.out.println(count);
        
    }
}