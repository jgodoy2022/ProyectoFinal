package visual;

import org.example.Habitat1;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PanelBosqueTest {

    @Test
    void paintComponent() {
        Habitat1 habitat = new Habitat1(5);
        PanelBosque panelBosque = new PanelBosque(habitat);
        panelBosque.setSize(700, 500);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelBosque);
        frame.setSize(800, 600);
        frame.setVisible(true);
        assertDoesNotThrow(() -> panelBosque.paintComponent(panelBosque.getGraphics()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }
}