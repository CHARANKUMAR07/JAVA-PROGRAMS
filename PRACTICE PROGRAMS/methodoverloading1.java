public class methodoverloading1 {
    int add(int a,int b){
        return a+b;
}
int add(int a,int b,int c){
    return a+b+c;
}
public static void main(String[] args){
    methodoverloading1 a=new methodoverloading1();

    System.out.println(a.add(11,12));
System.out.println(a.add(12,12,13));

}
}
