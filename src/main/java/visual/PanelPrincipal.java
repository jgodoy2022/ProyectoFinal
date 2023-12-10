package visual;

import org.example.Habitat1;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private Habitat1 habitat;

    public PanelPrincipal() {
        habitat = new Habitat1(20);
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        PanelSabana panelsabana = new PanelSabana(habitat);
        PanelAcuario panelacuario = new PanelAcuario(habitat);
        PanelSelva panelselva = new PanelSelva(habitat);
        PanelHumedal panelhumedal = new PanelHumedal(habitat);
        PanelAviario panelaviario = new PanelAviario(habitat);
        PanelBosque panelbosque = new PanelBosque(habitat);

        cardPanel.add(panelsabana, "PanelSabana");
        cardPanel.add(panelacuario, "PanelAcuario");
        cardPanel.add(panelselva, "PanelSelva");
        cardPanel.add(panelhumedal, "PanelHumedal");
        cardPanel.add(panelaviario, "PanelAviario");
        cardPanel.add(panelbosque, "PanelBosque");

        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);
    }

    public void mostrarHabitat(String nombreHabitat) {
        cardLayout.show(cardPanel, nombreHabitat);
    }
    public void mostrarVistaTodosHabitats() {
        cardLayout.show(cardPanel, "PanelTodosHabitats");
    }

}
