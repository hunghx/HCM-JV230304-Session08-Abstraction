import abtraction.Colorable;

public class Circle implements Colorable {
    private int radius;
    public  Circle( int r){
        this.radius = r;
    }

    @Override
    public void printColor() {
        System.out.println("Màu hồng");
    }
}
