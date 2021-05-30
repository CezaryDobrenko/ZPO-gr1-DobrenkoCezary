package ZPO.lab11.zadanie1;

import java.awt.*;

public abstract class State {
    public abstract void draw(Graphics2D g2, Point point);
    public abstract State getObj();
}