package ZPO.lab03.zadanie4;

import javax.swing.*;
import java.awt.*;

public class PanelInit extends Observer {
    public PanelInit() {
        JFrame frame = new JFrame("Points");
        PanelPoint panel = new PanelPoint();
        PanelChart panelchart = new PanelChart();
        PanelCounter panelcounter = new PanelCounter();
        PanelArea panelclickarea = new PanelArea();

        initFrameSettings(frame);
        setSubscribers(panelclickarea,panelcounter,panel,panelchart);
        setFrame(frame,panelclickarea,panelcounter,panel,panelchart);
    }

    public JFrame initFrameSettings(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setBackground(new Color(255, 20, 20));
        return frame;
    }

    public PanelArea setSubscribers(PanelArea panelclickarea, PanelCounter panelcounter, PanelPoint panel, PanelChart panelchart ){
        panelclickarea.subscribe(panelcounter);
        panelclickarea.subscribe(panel);
        panelclickarea.subscribe(panelchart);
        return panelclickarea;
    }

    public void setFrame(JFrame frame, PanelArea panelclickarea, PanelCounter panelcounter, PanelPoint panel, PanelChart panelchart ){
        frame.add(panel);
        frame.add(panelclickarea);
        frame.add(panelcounter);
        frame.add(panelchart);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
    }
}