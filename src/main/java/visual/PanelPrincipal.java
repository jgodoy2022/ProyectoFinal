package visual;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public PanelPrincipal() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        PanelSabana panelsabana = new PanelSabana();
        PanelAcuario panelacuario = new PanelAcuario();
        PanelSelva panelselva = new PanelSelva();
        PanelHumedal panelhumedal = new PanelHumedal();
        PanelAviario panelaviario = new PanelAviario();
        PanelBosque panelbosque = new PanelBosque();

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
