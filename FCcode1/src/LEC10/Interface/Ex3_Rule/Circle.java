
package LEC10.Interface.Ex3_Rule;


public class Circle implements IColor{

    @Override
    public void fillColor() {
       System.out.println("Drawing a circle");
    }

    @Override
    public void drawShape() {
        System.out.println("Filling the circle with green");
    }
    
}
