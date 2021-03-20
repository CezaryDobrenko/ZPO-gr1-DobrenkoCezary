package ZPO.lab03.zadanie4;

import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;

public class PanelChart extends JPanel implements iObserver {
    private ArrayList<PanelCoordinate> clicks = new ArrayList<PanelCoordinate>();

    public PanelChart() {
        this.setBackground(new Color(111, 255, 111));
        this.setLocation(600, 0);
        this.setSize(300, 300);
    }

    public void update(Object object) {
        this.clicks = (ArrayList<PanelCoordinate>) object;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics graphic) {
        ArrayList<PanelCoordinate> coords = getCords();
        graphic = setPanelSettings(graphic);
        for (int i = 0; i < coords.size(); ++i) {
            PanelCoordinate center = new PanelCoordinate(300, 450);
            PanelCoordinate c = coords.get(i);
            int distance = (int) PanelCoordinate.DistanceFormula(c, center);
            graphic.fillRect(i * 5 + 2, 300 - distance, 5, distance);
        }
        graphic.dispose();
    }

    public Graphics setPanelSettings(Graphics graphic){
        graphic.setColor(new Color(111, 255, 111));
        graphic.fillRect(0, 0, 300, 300);
        graphic.setColor(new Color(255, 0, 0));
        return graphic;
    }

    public ArrayList<PanelCoordinate> getCords(){
        ArrayList<PanelCoordinate> coords = new ArrayList<>();
        int fromIndex;
        int toIndex = this.clicks.size() - 1;
        if (this.clicks.size() < 60)
            fromIndex = 0;
        else
            fromIndex = this.clicks.size() - 60;
        for (int i = fromIndex; i < toIndex; ++i)
            coords.add(this.clicks.get(i));
        return coords;
    }
}