
package LEC10.AbstractClass.AbstractMethod;


public class Square extends Shape{
 private double side;
 public Square(double side){
 this.side = side;
 }
    @Override
    public double calculatorArea() {
       return side * side;
    }
    
}
