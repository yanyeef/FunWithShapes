import java.awt.*;
import java.util.Scanner;
public class Strings extends Shape{
    private String str;
    private Scanner scan = new Scanner(System.in);
    public Strings() {
        super();
        str = "Hello";
    }

    @Override
    public void draw(Graphics g) {
        //set color
        g.setColor(getColor());
        g.drawString(str, getMinX(), getMinY());
    }
}