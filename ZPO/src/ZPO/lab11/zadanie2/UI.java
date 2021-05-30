package ZPO.lab11.zadanie2;

import javax.swing.*;
import java.awt.*;

public class UI {
    private MoviePlayer player;
    private static JTextField textField = new JTextField();

    public UI(MoviePlayer player) {
        this.player = player;
    }

    public void init() {
        JPanel buttons = buttons_definition();
        JPanel context = context_definition(buttons);
        JFrame frame = frame_definition(context);
    }

    public JPanel buttons_definition(){
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton turnOn = new JButton("Turn on");
        turnOn.addActionListener(e -> textField.setText(player.getState().onOnState()));
        JButton turnOff = new JButton("Turn off");
        turnOff.addActionListener(e -> textField.setText(player.getState().onOffState()));
        JButton nextChannel = new JButton("Next channel");
        nextChannel.addActionListener(e -> textField.setText(player.getState().onNextState()));
        JButton prevChannel = new JButton("Prev channel");
        prevChannel.addActionListener(e -> textField.setText(player.getState().onPrevState()));
        buttons.add(turnOn);
        buttons.add(turnOff);
        buttons.add(nextChannel);
        buttons.add(prevChannel);
        return buttons;
    }

    public JPanel context_definition(JPanel buttons){
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        context.add(textField);
        context.add(buttons);
        return context;
    }

    public JFrame frame_definition(JPanel context){
        JFrame frame = new JFrame("Movie player 2000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(context);
        frame.setVisible(true);
        frame.setSize(500, 100);
        return frame;
    }

}