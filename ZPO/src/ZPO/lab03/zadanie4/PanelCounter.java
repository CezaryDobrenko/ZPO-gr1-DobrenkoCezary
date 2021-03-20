package ZPO.lab03.zadanie4;

import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;

public class PanelCounter extends JPanel implements iObserver {
    JTextPane text = new JTextPane();

    public PanelCounter() {
        text.setForeground(new Color(0, 0, 0));
        text.setBackground(new Color(111, 255, 111));
        this.setBackground(new Color(111, 255, 111));
        this.setLocation(600, 305);
        this.setSize(300, 50);
        this.setVisible(true);
        this.add(text);
    }

    public void update(Object object) {
        ArrayList<PanelCoordinate> clicks = (ArrayList<PanelCoordinate>) object;
        text.setText("Licznik przyciśnięć: " + clicks.size());
        reset();
    }

    public void reset(){
        this.repaint();
        this.revalidate();
    }
}