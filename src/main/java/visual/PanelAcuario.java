package visual;

import org.example.HabitatIncorrectoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelAcuario extends JPanel {
    private ImageIcon leon,buho,canguro,capibara,peces,serpiente;
    private ImageIcon fondo;
    private List<Point> posicionesOcupadas = new ArrayList<>();

    public PanelAcuario() {
        fondo = new ImageIcon("src/main/java/visual/Imagenes/panelacuario.jpg");
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

        agregarLeonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarImagenAleatoria(leon);
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


    private void agregarImagenAleatoria(ImageIcon imagen) {
        int x, y;
        int anchoImage = imagen.getIconWidth();
        int altoImage = imagen.getIconHeight();

        if (imagen != peces) {
            try {
                throw new HabitatIncorrectoException("¡Solo se permite agregar peces al hábitat!");
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen de fondo
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);

        // Dibuja las imágenes según las posiciones ocupadas
        for (Point posicion : posicionesOcupadas) {
            g.drawImage(peces.getImage(), posicion.x, posicion.y, this);
        }
    }
}
