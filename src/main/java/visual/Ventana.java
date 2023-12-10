package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El Jframe ventana representa la ventana de la interfaz grafica, se utiliza para poder mostrar la interfaz grafica del codigo
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */
public class Ventana extends JFrame {

    /** Referencia de al panel principal el cual contiene a el resto de paneles*/
    private PanelPrincipal panelPrincipal;

    /**
     * Constructor inicializa la ventana y configura sus propiedades
     */
    public Ventana() {
        panelPrincipal = new PanelPrincipal();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300, 800);
        this.setLayout(new BorderLayout());

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu archivoMenu = new JMenu("Archivo");
        JMenu habitatsMenu = new JMenu("Habitats");

        JMenuItem sabanaItem = new JMenuItem("Sabana");
        JMenuItem acuarioItem = new JMenuItem("Acuario");
        JMenuItem selvaItem = new JMenuItem("Selva");
        JMenuItem humedalItem = new JMenuItem("Humedal");
        JMenuItem aviarioItem = new JMenuItem("Aviario");
        JMenuItem bosqueItem = new JMenuItem("Bosque");

        JMenuItem volverItem = new JMenuItem("Volver a todos los Habitats");

        // Acciones para los elementos del menú
        sabanaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelSabana");
            }
        });

        acuarioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelAcuario");
            }
        });

        selvaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelSelva");
            }
        });

        humedalItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelHumedal");
            }
        });

        aviarioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelAviario");
            }
        });

        bosqueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPrincipal.mostrarHabitat("PanelBosque");
            }
        });

        volverItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la vista con los 6 hábitats
                panelPrincipal.mostrarVistaTodosHabitats();
            }
        });
        // Agregar elementos al menú
        habitatsMenu.add(sabanaItem);
        habitatsMenu.add(acuarioItem);
        habitatsMenu.add(selvaItem);
        habitatsMenu.add(humedalItem);
        habitatsMenu.add(aviarioItem);
        habitatsMenu.add(bosqueItem);
        habitatsMenu.addSeparator(); // Separador entre los hábitats y la opción de volver
        habitatsMenu.add(volverItem);

        menuBar.add(archivoMenu);
        menuBar.add(habitatsMenu);
        this.setJMenuBar(menuBar);

        // Panel principal
        this.add(panelPrincipal, BorderLayout.CENTER);

        // Mostrar la vista con los 6 hábitats al iniciar el programa
        panelPrincipal.mostrarVistaTodosHabitats();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
