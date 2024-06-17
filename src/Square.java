import abtraction.Colorable;

import java.io.Serializable;

public class Square extends Shape implements Colorable, Serializable, Cloneable {
    private  String color;
    public Square(String color) {
        super(4);
        this.color = color;
    }

    @Override
    public int getCanh() {
        return 100;
    }
    public int getCanhShape(){
        return super.getCanh();
    }

    @Override
    public void printColor() {
        System.out.println("màu xanh");
    }

    public static void main(String[] args) {
        Square s = new Square("red");
        System.out.println(s.getCanhShape()); // 10
    }
}
