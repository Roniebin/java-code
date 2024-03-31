package solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []a= br.readLine().split(" ");
    BigInteger bigNumber1 = new BigInteger(String.valueOf(a[1]));  
    BigInteger bigNumber2 = new BigInteger(String.valueOf(a[1]));

        
    System.out.println(bigNumber1.add(bigNumber2));
    }
   
}