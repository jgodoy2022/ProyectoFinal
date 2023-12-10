package visual;

import org.example.Habitat1;

import javax.swing.*;
import java.awt.*;

/**
 * El `PanelPrincipal` es un panel que combina y organiza los componentes visuales de los habitats y los animales
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */
public class PanelPrincipal extends JPanel {

    /** Representa un panel que utiliza el diseño de tarjetas*/
    private JPanel cardPanel;


    /** Representa un administrador de diseño que gestiona componentes en tarjetas*/
    private CardLayout cardLayout;


    /** Instancia de habitat para uso de excepciones y union de logica con interfaz grafica*/
    private Habitat1 habitat;

    /**
     * Constructor de la clase `PanelPrincipal`.
     * Inicializa el hábitat y configura el CardLayout con subpaneles correspondientes a cada hábitat.
     */
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

        // Agregar subpaneles al CardLayout con nombres identificativos
        cardPanel.add(panelsabana, "PanelSabana");
        cardPanel.add(panelacuario, "PanelAcuario");
        cardPanel.add(panelselva, "PanelSelva");
        cardPanel.add(panelhumedal, "PanelHumedal");
        cardPanel.add(panelaviario, "PanelAviario");
        cardPanel.add(panelbosque, "PanelBosque");

        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);
    }

    /**
     * Cambia la vista del hábitat actual mostrando el hábitat con el nombre especificado.
     * @param nombreHabitat El nombre del hábitat que se quiere mostrar.
     */
    public void mostrarHabitat(String nombreHabitat) {
        cardLayout.show(cardPanel, nombreHabitat);
    }

    /**
     * Cambia la vista a la representación de todos los hábitats.
     */
    public void mostrarVistaTodosHabitats() {
        cardLayout.show(cardPanel, "PanelTodosHabitats");
    }

}
