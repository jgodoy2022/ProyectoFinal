package visual;

import org.example.AreaSaturadaException;
import org.example.Habitat1;
import org.example.HabitatIncorrectoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * El `PanelSabana` es un panel que representa el hábitat de la Sabana en la interfaz gráfica.
 * @author Gabriela Isidora Zambrano Novoa
 * @author Joaquin Alejandro Godoy Vergara
 */
public class PanelSabana extends JPanel {
    /** ImageIcon que almacena la imagen de los animales*/
    private ImageIcon leon,buho,canguro,capibara,peces,serpiente;

    /** ImageIcon que almacena la imagen del fondo*/
    private ImageIcon fondo;

    /** Lista que almacena objetos tipo point que representan las coordenadas de cada imagen*/
    private List<Point> posicionesOcupadas = new ArrayList<>();

    /** Instancia de habitat para uso de excepciones y union de logica con interfaz grafica*/
    private Habitat1 habitat;

    /**
     * Constructor que inicializa el `PanelSabana` con su hábitat asociado.
     * @param habitat El hábitat de la Sabana.
     */
    public PanelSabana(Habitat1 habitat) {
        this.habitat=habitat;
        fondo = new ImageIcon("src/main/java/visual/Imagenes/panelsabana.jpg");
        this.setPreferredSize(new Dimension(700, 500));

        leon = new ImageIcon("src/main/java/visual/Imagenes/leon.png");
        buho = new ImageIcon("src/main/java/visual/Imagenes/buho.png");
        canguro = new ImageIcon("src/main/java/visual/Imagenes/canguro.png");
        capibara = new ImageIcon("src/main/java/visual/Imagenes/capibara.png");
        peces = new ImageIcon("src/main/java/visual/Imagenes/peces.png");
        serpiente = new ImageIcon("src/main/java/visual/Imagenes/serpiente.png");

        JButton agregarLeonButton = new JButton("Agregar León");
        JButton agregarBuhoButton = new JButton("Agregar Buho");
        JButton agregarCanguroButton = new JButton("Agregar Canguro");
        JButton agregarCapibaraButton = new JButton("Agregar Capibara");
        JButton agregarPecesButton = new JButton("Agregar Peces");
        JButton agregarSerpienteButton = new JButton("Agregar Serpiente");

        // Acciones para los botones de agregar
        agregarLeonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (habitat != null) {
                    agregarImagenAleatoria(leon);
                    try {
                        habitat.mostrarAnimal(1);
                    } catch (AreaSaturadaException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                        deshabilitarBotonesAgregar();
                        habitat.ceroleon();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No puede ingresar más animales");
                }
            }
        });

        this.add(agregarLeonButton);

        agregarBuhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarImagenAleatoria(buho);
            }
        });

        this.add(agregarBuhoButton);
        agregarCanguroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarImagenAleatoria(canguro);
            }
        });

        this.add(agregarCanguroButton);
        agregarCapibaraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarImagenAleatoria(capibara);
            }
        });

        this.add(agregarCapibaraButton);
        agregarPecesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarImagenAleatoria(peces);
            }
        });

        this.add(agregarPecesButton);
        agregarSerpienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    agregarImagenAleatoria(serpiente);
            }
        });

        this.add(agregarSerpienteButton);
    }


    /**
     * Agrega una imagen de animal en una posición aleatoria en el panel, evitando superposiciones.
     * @param imagen La imagen del animal a agregar.
     */
    private void agregarImagenAleatoria(ImageIcon imagen) {
        int x, y;
        int anchoImage = imagen.getIconWidth();
        int altoImage = imagen.getIconHeight();

        if (imagen != leon) {
            try {
                throw new HabitatIncorrectoException("¡Solo se permite agregar leones al hábitat!");
            } catch (HabitatIncorrectoException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        do {
            x = (int) (Math.random() * (getWidth() - anchoImage));
            y = (int) (Math.random() * (getHeight() - altoImage));
        } while (seSuperpone(x, y, anchoImage, altoImage));

        posicionesOcupadas.add(new Point(x, y));
        repaint();
    }

    /**
     * Verifica si la nueva posición se superpone con alguna posición ocupada.
     * @param x La coordenada x de la nueva posición.
     * @param y La coordenada y de la nueva posición.
     * @param ancho El ancho de la imagen.
     * @param alto El alto de la imagen.
     * @return true si la posición se superpone, false de lo contrario.
     */
    private boolean seSuperpone(int x, int y, int ancho, int alto) {
        Rectangle nuevaPosicion = new Rectangle(x, y, ancho, alto);
        for (Point posicion : posicionesOcupadas) {
            Rectangle posicionOcupada = new Rectangle(posicion.x, posicion.y, ancho, alto);
            if (nuevaPosicion.intersects(posicionOcupada)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Dibuja el fondo del panel con el respectivo animal.
     * @param g Objeto Graphics para dibujar en el panel
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen de fondo
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);

        // Dibuja las imágenes según las posiciones ocupadas
        for (Point posicion : posicionesOcupadas) {
            g.drawImage(leon.getImage(), posicion.x, posicion.y, this);
        }
    }

    /**
     * Deshabilita todos los botones de agregar en el panel actual (PanelSelva).
     */
    private void deshabilitarBotonesAgregar() {
        for (Component component : this.getComponents()) {
            if (component instanceof JButton) {
                component.setEnabled(false);
            }
        }
    }
}
