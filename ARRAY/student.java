public class student {
    String name;
    String classname;
    int id;
    public student(String name, String classname, int id) {
        this.name = name;
        this.classname = classname;
        this.id = id;
    }
    @Override
    public String toString() {
        return "student [name=" + name + ", classname=" + classname + ", id=" + id + "]";
    }
    
    

}
