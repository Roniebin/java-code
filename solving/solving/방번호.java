package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;

public class 방번호{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []n=br.readLine().split("");

        ArrayList <String[]> list = new ArrayList<String[]>();

        String [] a={"0","1","2","3","4","5","6","7","8","9"};
        list.add(a);

        int count=1;

        for(int j=0;j<n.length;j++){
            boolean okay=false;
            for(int i=0; i<list.size(); i++){
                

                for(int s=0;s<list.get(i).length; s++){
                     // 원래 값이랑 비교해서 안에 있으면

                   if(n[j].equals(list.get(i)[s])){
                        n[j]="-1";
                        list.get(i)[s]="-2";
                        okay=true;
                        break;
                    }else{
                        if(n[j].equals("6")||n[j].equals("9") ){
                            if(list.get(i)[6].equals("6") ){
                                n[j]="-1";
                                list.get(i)[6]="-2";
                                okay=true;
                                break;
                            }
                            else if(list.get(i)[9].equals("9") ){
                                n[j]="-1";
                                list.get(i)[9]="-2";
                                okay=true;
                                break;
                            }else{
                                okay=false;
                               
                            }
                        }
                    }
                }

            }
            if(okay==false){
                count++;
                String [] b={"0","1","2","3","4","5","6","7","8","9"};
                list.add(b);
                j-=1;
            }
        }
       

        System.out.println(count);
    }
}