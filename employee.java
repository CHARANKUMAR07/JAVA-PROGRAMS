public class employee {
    int idnum;
    String name;
    String department;
    int salary;
    public employee(int idnum, String name, String department, int salary) {
        this.idnum = idnum;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public employee() {
        //TODO Auto-generated constructor stub
    }
    public int getIdnum() {
        return idnum;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "employee [idnum=" + idnum + ", name=" + name + ", department=" + department + ", salary=" + salary
                + "]";
    }
     

    
    


    }

