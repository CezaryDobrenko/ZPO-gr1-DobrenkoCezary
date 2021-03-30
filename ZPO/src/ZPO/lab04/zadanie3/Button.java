package ZPO.lab04.zadanie3;

import javax.swing.*;
import java.awt.event.*;

public class Button extends JButton {
    private Command command;

    public Button(Command c, String text) {
        this.command = c;
        this.setText(text);

        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                command.execute();
            }
        });
    }

    public void setCommand(Command c) {
        this.command = c;
    }
}
