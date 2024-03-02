import java.util.Scanner;

public class neonnumber {
    public static void main(String[] args) {
        int  sum =0,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER: ");
        int a=s.nextInt();
            int b=(a*a);
             while(b!=0){
             temp=b%10;
             sum+=temp;
             b=b/10;}
             if(a==sum)
              System.out.println(a+" IS A NEON NUMBER");
              else
            System.out.println(a+" IS  NOT A NEON NUMBER");

         }
 }
    


    
            