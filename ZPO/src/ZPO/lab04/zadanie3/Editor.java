package ZPO.lab04.zadanie3;

import java.awt.*;
import javax.swing.*;

public class Editor extends JPanel {
    public static final int stateColor = 3;
    public static final int stateWidth = 2;
    public static final int stateHeight = 1;
    public static final int stateNone = 0;
    public int state = stateNone;
    private Color rectColor = new Color(111, 155, 255);
    private Color lastColor = rectColor;
    private int rectWidth = 100;
    private int lastWidth = rectWidth;
    private int rectHeight = 100;
    private int lastHeight = rectHeight;

    public Editor(int width, int height) {
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        this.state = this.stateNone;

        Button changeColorButton = new Button(new SetColorCommand(this), "Change color");
        Button changeHeightButton = new Button(new SetHeightCommand(this), "Change height");
        Button changeWidthButton = new Button(new SetWidthCommand(this), "Change width");
        Button undoButton = new Button(new UndoCommand(this), "Undo");

        JPanel toolbar = new Toolbar();
        toolbar.add(changeWidthButton);
        toolbar.add(changeHeightButton);
        toolbar.add(changeColorButton);
        toolbar.add(undoButton);
        toolbar.setVisible(true);

        this.setLocation(0, 200);
        this.setSize(width, height - 200);
        this.add(toolbar);

        frame.add(this);

    }

    public void setRectWidth(int width) {
        this.rectWidth = width;
        this.repaint();
    }

    public int getRectWidth(){
        return this.rectWidth;
    }

    public void setRectHeight(int height) {
        this.rectHeight = height;
        this.repaint();
    }

    public int getRectHeight(){
        return this.rectHeight;
    }

    public void setRectColor(Color color) {
        this.rectColor = color;
        this.repaint();
    }

    public Color getRectColor(){
        return this.rectColor;
    }

    public void saveColorState(Color color) {
        this.state = this.stateColor;
        this.lastColor = color;
    }

    public void saveWidthState(int width) {
        this.state = this.stateWidth;
        this.lastWidth = width;
    }

    public void saveHeightState(int height) {
        this.state = this.stateHeight;
        this.lastHeight = height;
    }

    public void undoLastChange() {
        System.out.println(this.rectHeight);
        System.out.println(this.lastHeight);
        if(this.state == stateColor){
            this.rectColor = lastColor;
        } else if (this.state == stateHeight){
            this.rectHeight = lastHeight;
        } else if (this.state == stateWidth){
            this.rectWidth = lastWidth;
        } else {
            System.out.println("Nie mam zarejestrowanej żadnej akcji");
        }
        System.out.println(this.rectHeight);
        System.out.println(this.lastHeight);
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        int cx = this.getWidth() / 2;
        int cy = this.getHeight() / 2;

        System.out.println("current state is: " + this.state);

        g.setColor(rectColor);
        g.fillRect(cx - rectWidth / 2, cy - rectHeight / 2, rectWidth , rectHeight);

        g.dispose();

    }
}