package visual;

import org.example.Habitat1;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PanelSelvaTest {

    @Test
    void paintComponent() {
        Habitat1 habitat = new Habitat1(5);
        PanelSelva panelSelva = new PanelSelva(habitat);
        panelSelva.setSize(700, 500);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelSelva);
        frame.setSize(800, 600);
        frame.setVisible(true);
        assertDoesNotThrow(() -> panelSelva.paintComponent(panelSelva.getGraphics()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }
}
