package visual;

import org.example.Habitat1;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PanelSabanaTest {

    @Test
    void paintComponent() {
        Habitat1 habitat = new Habitat1(5);
        PanelSabana panelsabana = new PanelSabana(habitat);
        panelsabana.setSize(700, 500);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelsabana);
        frame.setSize(800, 600);
        frame.setVisible(true);
        assertDoesNotThrow(() -> panelsabana.paintComponent(panelsabana.getGraphics()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }
}