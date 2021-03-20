package ZPO.lab03.zadanie4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JPanel;

public class PanelArea extends JPanel implements iObserver {
    private ArrayList<PanelCoordinate> clicks = new ArrayList<>();
    private Observer o = new Observer();

    public PanelArea() {
        this.setBackground(new Color(40, 40, 40));
        this.setLocation(0, 0);
        this.setSize(600, 900);
        o.subscribe(this);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();

                clicks.add(new PanelCoordinate(x, y));
                o.update(clicks);
            }
        });
    }

    public void subscribe(iObserver observer) {
        this.o.subscribe(observer);
    }

    public void update(Object o) {
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        PanelCoordinate ce = new PanelCoordinate(300, 450);
        g.setColor(new Color(40, 40, 40));
        g.fillRect(0, 0, 600, 900);
        g.setColor(new Color(230, 230, 230));
        g.drawLine(ce.x - 20, ce.y, ce.x+20, ce.y);
        g.drawLine(ce.x, ce.y - 20, ce.x, ce.y + 20);

        for (int i = 0; i < this.clicks.size(); ++i) {
            PanelCoordinate c = this.clicks.get(i);
            g.fillArc(c.x - 4, c.y - 4, 8, 8, 0, 360);
        }
        g.dispose();
    }
}