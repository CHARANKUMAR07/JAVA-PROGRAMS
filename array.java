public class array {
    /**
     * @param args
     */
    public static void main(String[] args)
     {
        int[] a={1,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++)
        {

        
        System.out.println(a[i]);}
    
        String[] names={"charan","bharath","vinay","jayanth"};
        for( int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        int[][] array2d={{1,2},{4,5}};
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[0].length;j++){
                System.out.print(array2d[i][j]);
                System.out.print(" ");
            }
            System.out.println(" "); 

        }
        
     }
}
