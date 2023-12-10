package visual;

import org.example.Habitat1;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PanelAcuarioTest {

    @Test
    void paintComponent() {
        Habitat1 habitat = new Habitat1(5);
        PanelAcuario panelAcuario=new PanelAcuario(habitat);
        panelAcuario.setSize(700, 500);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelAcuario);
        frame.setSize(800, 600);
        frame.setVisible(true);
        assertDoesNotThrow(() -> panelAcuario.paintComponent(panelAcuario.getGraphics()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }
}