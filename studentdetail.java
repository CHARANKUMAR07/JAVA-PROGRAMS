

public class studentdetail{
    
    public static void main(String[] args){
    
        student charan=new student();
        charan.idNumber=1;
        charan.name="charan kumar";
        charan.course="bsc";
 System.out.println(charan); 
    
     student bharath=new student(2,"bojesh", "java");

     System.out.println(bharath);


     student jayanth=new student();
     jayanth.idNumber=3;
     jayanth .name="PALLEM JAYANTH";
     jayanth.course="BSC";
System.out.println(jayanth);  

student ajay =new student(1,"ajay","java",789657457);
System.out.println(ajay);
}
student kumar=new student(1,"kumar");
     System.out.println(kumar);
     


    }

