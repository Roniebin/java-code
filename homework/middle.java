package homework.solving.solving;

import java.util.Scanner;

public class middle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a,b,c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b){
            if(a<c){
                System.out.println(a);
            }else if(a>c){
                if(c<b){
                    System.out.println(b);
                }else {
                    System.out.println(c);
                }
            }else {
                System.out.println(b);
            }
        }else if(a<b){
            if(b<c){
                System.out.println(b);
            }else if(b>c){
                if(c<a)
                {
                    System.out.println(a);
                }else {
                    System.out.println(c);
                }
              
            }else {
                System.out.println(b);
            }
        }else if(a==b){
            if(b<c){
                System.out.println(b);
            }else if(b>c){
                System.out.println(b);
            }else {
                System.out.println(b);
            }
        }
        
    }
    
}
