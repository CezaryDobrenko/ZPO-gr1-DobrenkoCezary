package ZPO.lab11.zadanie1;

import java.awt.*;

public class ShapeCircleState extends State {
    @Override
    public void draw(Graphics2D g2, Point point) {
        g2.fillOval(point.x, point.y, 20, 20);
    }

    @Override
    public State getObj() {
        return new ShapeCircleState();
    }
}
