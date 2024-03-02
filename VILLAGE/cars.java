public class cars {
    private String colour;
    private int doors;
    public String getColour(){
    return colour;
    }
    public void setColour(String colour){
    this.colour =colour;
}
    public int getdoors(){
        return doors;
    }
      public void setdoors( int doors){
           this .doors= doors;
      }  

      public class encapsulation{
        public static void main(String[] args) {
            cars c=new cars();
            c.setColour("yellow");
            c.setdoors(4);
           System.out.println("CAR COLOUR IS : " +c.getColour() +"\n DOORS ARE: "  +c.getdoors());
           cars c1=new cars();
           c1.setColour("WHITE");
           c1.setdoors(5);
           System.out.println("CAR COLOUR IS : " +c1.getColour() +"\n DOORS ARE: "  +c1.getdoors());
           

          
             
        }

      }
      
      }