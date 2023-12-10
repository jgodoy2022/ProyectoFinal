package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class PanelSelva extends JPanel {
    private Image leon, buho, canguro, capibara, peces, serpiente;
    private ImageIcon fondo;
    private List<Point> posicionesOcupadas = new ArrayList<>();


    public PanelSelva() {
        leon= new ImageIcon("src/main/java/visual/Imagenes/leon.jpg").getImage();
        buho= new ImageIcon("src/main/java/visual/Imagenes/buho.jpg").getImage();
        canguro= new ImageIcon("src/main/java/visual/Imagenes/canguro.jpg").getImage();
        capibara= new ImageIcon("src/main/java/visual/Imagenes/capibara.jpg").getImage();
        peces= new ImageIcon("src/main/java/visual/Imagenes/peces.jpg").getImage();
        serpiente= new ImageIcon("src/main/java/visual/Imagenes/serpiente.jpg").getImage();
        fondo = new ImageIcon("src/main/java/visual/Imagenes/panelselva.jpg");
        this.setPreferredSize(new Dimension(700, 500));

        JButton agregarLeonButton = new JButton("Agregar León");
        JButton agregarBuhoButton = new JButton("Agregar Buho");
        JButton agregarCanguroButton = new JButton("Agregar Canguro");
        JButton agregarCapibaraButton = new JButton("Agregar Capibara");
        JButton agregarPecesButton = new JButton("Agregar Pez");
        JButton agregarSerpienteButton = new JButton("Agregar Serpiente");

        agregarLeonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un León al panel Selva
                System.out.println("León agregado a la Selva");
                agregarImagenAleatoria(leon);
            }
        });

        agregarBuhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Búho al panel Selva
                System.out.println("Búho agregado a la Selva");
                agregarImagenAleatoria(buho);
            }
        });

        agregarCanguroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Canguro al panel Selva
                System.out.println("Canguro agregado a la Selva");
                agregarImagenAleatoria(canguro);
            }
        });

        agregarCapibaraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Capibara agregado a la Selva");
                agregarImagenAleatoria(capibara);
            }
        });
        agregarPecesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Pez agregado a la Selva");
                agregarImagenAleatoria(peces);
            }
        });
        agregarSerpienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Serpiente agregado a la Selva");
                agregarImagenAleatoria(serpiente);
            }
        });

        // Agregar los botones al panel
        this.add(agregarLeonButton);
        this.add(agregarBuhoButton);
        this.add(agregarCanguroButton);
        this.add(agregarCapibaraButton);
        this.add(agregarPecesButton);
        this.add(agregarSerpienteButton);

        // Agregar un MouseListener para detectar eventos del mouse
    }
    private void agregarImagenAleatoria(Image imagen) {
        // Genera posiciones aleatorias evitando superposiciones
        int x, y;
        do {
            x = (int) (Math.random() * (getWidth() - imagen.getWidth(null)));
            y = (int) (Math.random() * (getHeight() - imagen.getHeight(null)));
        } while (seSuperpone(x, y, imagen.getWidth(null), imagen.getHeight(null)));

        // Agrega la posición a la lista de posiciones ocupadas
        posicionesOcupadas.add(new Point(x, y));

        // Dibuja la imagen en la posición aleatoria
        repaint();  // Trigger repaint to call paintComponent
    }


    private boolean seSuperpone(int x, int y, int ancho, int alto) {
        Rectangle nuevaPosicion = new Rectangle(x, y, ancho, alto);
        for (Point posicion : posicionesOcupadas) {
            Rectangle posicionOcupada = new Rectangle(posicion.x, posicion.y, ancho, alto);
            if (nuevaPosicion.intersects(posicionOcupada)) {
                return true; // Se superpone con una posición ocupada
            }
        }
        return false; // No se superpone con ninguna posición ocupada
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja las imágenes según las posiciones ocupadas
        for (Point posicion : posicionesOcupadas) {
            g.drawImage(leon, posicion.x, posicion.y, this);
        }

        // Dibuja la imagen de fondo
       g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }


}
