class Shape{
    private int numOfSides;
   
    public Shape(int numOfSides){
        this.numOfSides = numOfSides;
    }
    public int getNumOfSides(){
        return numOfSides;
    }
   
    public void setNumOfSides(int numOfSides){
        this.numOfSides = numOfSides;
    }
}

class Circle extends Shape{
    public Circle(){
        super(0);
    }
}
class Rectangle extends Shape{
    public Rectangle(){
        super(4);
    }
}
class Main{
    public static void main(String[] args){
        Circle myCircle = new Circle();
       
        System.out.println("Circle has " + myCircle.getNumOfSides() + " sides.");
       
        Rectangle myRectangle = new Rectangle();
        System.out.println("Rectangle has " + myRectangle.getNumOfSides() + " sides.");
    }
}
