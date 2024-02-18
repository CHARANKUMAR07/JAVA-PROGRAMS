public class student {
    int idNumber;
    String name;
    String course;
    int phone;
        
    
    public student()
    {

    }
    public student(int idNumber, String name, String course, int phone) {
        this.idNumber = idNumber;
        this.name = name;
        this.course = course;
        this.phone = phone;
    }
    public student(int idNumber, String name, String course)
     {
        this.idNumber = idNumber;
        this.name = name;
        this.course = course;
    }
    public student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }
    @Override
    public String toString() {
        return "constructor [idNumber=" + idNumber + ", name=" + name + ", course=" + course + ", phone=" + phone + "]";
    }
    
    
         }
