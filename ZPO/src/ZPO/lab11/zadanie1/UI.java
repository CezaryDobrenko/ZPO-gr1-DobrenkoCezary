package ZPO.lab11.zadanie1;

import javax.swing.*;
import java.awt.*;

public class UI {
    private DrawPanel panel;

    public UI(DrawPanel panel) {
        this.panel = panel;
    }

    public void init() {
        JPanel buttons = buttons_definition();
        DrawPanel drawPanel = new DrawPanel();
        JPanel context = context_definition(buttons, drawPanel);
        JFrame frame = frame_definition(context);
    }

    public JPanel buttons_definition(){
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton square = new JButton("Square");
        square.addActionListener(e -> panel.changeState(new ShapeSquareState()));
        JButton circle = new JButton("Circle");
        circle.addActionListener(e -> panel.changeState(new ShapeCircleState()));
        JButton roundedSquare = new JButton("Rounded Square");
        roundedSquare.addActionListener(e -> panel.changeState(new ShapeRoundedState()));
        buttons.add(square);
        buttons.add(circle);
        buttons.add(roundedSquare);
        return buttons;
    }

    public JPanel context_definition(JPanel buttons, DrawPanel drawPanel){
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        context.add(drawPanel);
        context.add(buttons);
        return context;
    }

    public JFrame frame_definition(JPanel context){
        JFrame frame = new JFrame("Paint 2000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(context);
        frame.setVisible(true);
        frame.setSize(400, 400);
        return frame;
    }

}