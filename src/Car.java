public class Car {
    private String model;
    private int countWheel;
    private String color;
    //getter -
    public String getColor(){
        return this.color;
    }
    //setter
    public void setColor(String color){
        this.color = color;
    }

    public void setCountWheel(int count){
        this.countWheel = count;
    }
//    b
    public void printColor(){
        System.out.println(getColor());
    }

}
