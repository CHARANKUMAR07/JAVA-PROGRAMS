public class animal {
    String name ;
    String breed;
    public animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "animal [name=" + name + ", breed=" + breed + "]";
    }
    public animal() {
    }
 


    
    
}
