package visual;

import org.example.Habitat1;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PanelHumedalTest {

    @Test
    void paintComponent() {
        Habitat1 habitat = new Habitat1(5);
        PanelHumedal panelHumedal=new PanelHumedal(habitat);
        panelHumedal.setSize(700, 500);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelHumedal);
        frame.setSize(800, 600);
        frame.setVisible(true);
        assertDoesNotThrow(() -> panelHumedal.paintComponent(panelHumedal.getGraphics()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }
}