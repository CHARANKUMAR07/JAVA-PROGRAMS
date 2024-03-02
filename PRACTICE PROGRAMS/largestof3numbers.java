import java.util.Scanner;
public class largestof3numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter three values:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        if(a>b && a>c){
            System.out.println("A IS LARGEST");}
        else if(b>c && b>a){
            System.out.println("B IS LARGEST");
            }
            else if(c>a && c>b){
                System.out.println("c IS LARGEST");
            }
            else{
                System.out.println("ALL ARE EQUAL");
            }
            
        }

        }
        
    

