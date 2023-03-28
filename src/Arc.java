import java.awt.*;

public class Arc extends Shape{
    private int startAngle;
    private int endAngle;

    public Arc() {
        super();
        endAngle = 70;
        startAngle = 30;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(g.getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, endAngle);
    }
}
