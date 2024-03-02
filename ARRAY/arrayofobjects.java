import java.util.ArrayList;
public class arrayofobjects {
    public static void main(String[] args) {
        ArrayList<student> studentlist=new ArrayList<>();
    student varun=new student("VARUN","JAVA",01 );
    student kiran=new student("KIRAN","JAVA",02);
    student viraj=new student("VIRAJ","PYTHON",03);
    
    studentlist.add(varun);
    studentlist.add(kiran);
    studentlist.add(viraj);
   
System.out.println(studentlist);
}
}