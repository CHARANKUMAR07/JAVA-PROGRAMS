public class overloading {
    public static Integer add(int a,int b){
        return a+b;
    }
    public static Integer add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
    public class addition{
        public static void main(String[] args) {
        overloading a=new overloading();
           System.out.println( "ADDTION OF NUMBERS IS :" +a.add(12.2,12.3));
           System.out.println("ADDTION OF NUMBERS IS :" +a.add(12,23,34));
           System.out.println("ADDTION OF NUMBERS IS :"+a.add(12,54));
           System.out.println("ADDTION OF NUMBERS IS :"+a.add(21.2,32.2,23.3));
        }
}
}