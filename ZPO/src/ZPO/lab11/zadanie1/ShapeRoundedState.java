package ZPO.lab11.zadanie1;

import java.awt.*;

public class ShapeRoundedState extends State {
    @Override
    public void draw(Graphics2D g2, Point point) {
        g2.fillRoundRect(point.x, point.y, 20, 20, 13 ,13);
    }

    @Override
    public State getObj() {
        return new ShapeRoundedState();
    }
}
