import java.util.Arrays;
public class secondlargestnum{
    public static void main (String[] args){
     int[] a={12,34,12,37,13};
     int n=a.length;
     Arrays.sort(a);
     System.out.println("ARRAY ELEMENTS AFTER SORTING " );
     for(int i=0;i<n;i++){
     System.out.print(a[i] + " ");
     }
     System.out.println();
     System.out.println( "SECOND LARGEST NUMBER IS : "+ a[n-2]);
    }
}
        

    
