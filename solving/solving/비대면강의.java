package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class 비대면강의 {
    public static void main(String args[]) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int [][]h=new int[2][3];
        int [][]h1=new int[2][3];
        int [][]h2=new int[2][3];

        String [] a=br.readLine().split(" ");
        
        for (int i=0,j=0,k=0; !(j==1 && i==6); i++,k++) {
            
            if(k==3){
                k=0;
                j++;
            }
            
            h[j][k]=Integer.parseInt(a[i]);
            h1[j][k]=Integer.parseInt(a[i]);
            h2[j][k]=Integer.parseInt(a[i]);
        }

       

        int dx=(h[0][0]*h[1][1])-(h[0][1]*h[1][0]);
        
        int dx1=first(h1);
        int dx2=second(h2);

        System.out.println(dx1/dx+" "+dx2/dx);
    }

    public static int first(int [][] h1)
    {
        h1[0][0]=h1[0][2];
        h1[1][0]=h1[1][2];
        
        return (h1[0][0]*h1[1][1])-(h1[0][1]*h1[1][0]);
        
    } public static int second(int [][] h2)
    {
        h2[0][1]=h2[0][2];
        h2[1][1]=h2[1][2];
        
        return (h2[0][0]*h2[1][1])-(h2[0][1]*h2[1][0]);
        
    }
}
