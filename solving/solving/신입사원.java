package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

class Person implements Comparable <Person>{
    public int rank1=0;
    public int rank2=0;

    public Person(String a[]){
        this.rank1=Integer.parseInt(a[0]);
        this.rank2=Integer.parseInt(a[1]);
    }
    
    @Override
    public int compareTo(Person o) {
        if(o.rank1<rank1){
            return 1;
        }else if(o.rank1>rank1){
            return -1;
        }
        return 0;

    }

}

public class 신입사원{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        ArrayList<Person> result= new ArrayList<Person>();
        ArrayList<Integer> result2= new ArrayList<Integer>();
       for(int i=0;i<T;i++){
            result.clear();
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());


            for(int j=0;j<n;j++){
                String []a=br.readLine().split(" ");
                result.add(new Person(a));
            }

            Collections.sort(result);

            int count=1;
            int _max=result.get(0).rank2;
            for(int j=1;j<n;j++){
                if(_max>result.get(j).rank2){
                    count++;
                    _max=result.get(j).rank2;
                }
                
            }
           result2.add(count);
        }
        
        for(int i=0;i<result2.size();i++){
            System.out.println(result2.get(i));
        }
    }
}