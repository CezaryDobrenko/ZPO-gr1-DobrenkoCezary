package ZPO.lab11.zadanie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private static State state = new ShapeSquareState();
    private static final long serialVersionUID = 1L;
    private ArrayList<Point> points;
    private ArrayList<State> statesHistory;

    public DrawPanel() {
        points = new ArrayList<Point>();
        statesHistory = new ArrayList<State>();
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                statesHistory.add(state.getObj());
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.red);
        for (int i = 0; i < points.size(); i++) {
            statesHistory.get(i).draw(g2, points.get(i));
        }
    }

    public void changeState(State state) {
        this.state = state;
    }
}