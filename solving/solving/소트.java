package solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 소트 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        String [] s=br.readLine().split(" ");

        int S=Integer.parseInt(br.readLine());
        int [] arr=new int [N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        int i=0;
        int temp=0;
        int max=0;
        int max_idx=0;
        boolean ex=false;

        while(S!=0){
            if(i==arr.length-1){
                break;
            }
            
            temp=0;
            ex=false;
            max=arr[i];
            max_idx=0;
           //갈수있는 범위에서 최대값 찾기
            for(int j=i;j< Math.min(i + S + 1, arr.length);j++){
                
                if(max<arr[j]){
                    max=arr[j];
                    max_idx=j;
                    temp=max_idx-i;
                    ex=true;
                }
            }

            if(ex==true){
                for(int k=max_idx;k>i;k--){
                    int temp1=arr[k-1];
                    arr[k-1]=arr[k];
                    arr[k]=temp1;
                    S--;
                    if(S<=0){
                        break;
                    }
                }
              
            }
           
            i++;

        }
      
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    
      
        
        
        
    }
    
}
