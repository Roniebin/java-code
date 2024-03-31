package homework.solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 명령프롬프트{
    public static void main(String[] arg){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcase=0;
        ArrayList<String[]> testcases = new ArrayList<String[]>();
        try{
            testcase=Integer.parseInt(reader.readLine());
            for(int i=0;i<testcase;i++){
                testcases.add(reader.readLine().split(""));
            }
        }catch(Exception e){}

        int pointer=0;
        while(true){
            
            if(pointer==testcases.get(0).length){
                break;
            }
            for(int i=0;i<testcases.size()-1;i++){
                if(!(testcases.get(i)[pointer].equals(testcases.get(i+1)[pointer]))){
                    for(int j=0;j<testcases.size();j++){
                        testcases.get(j)[pointer]="?";
                    }
              }
            }
            pointer++;
        }
       
        System.out.println(String.join("",testcases.get(0)));
        
    }
}