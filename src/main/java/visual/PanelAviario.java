package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAviario extends JPanel {
    private ImageIcon fondo;
    private ImageIcon imagenHover;
    private boolean mouseSobrePanel;

    public PanelAviario() {
        fondo = new ImageIcon("src/main/java/visual/Imagenes/aviario.jpg");
        imagenHover = new ImageIcon("src/main/java/visual/Imagenes/panelaviario.jpg");
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
            }
        });

        agregarBuhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Mono al panel Selva
                System.out.println("Buho agregado a la Selva");
            }
        });

        agregarCanguroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Canguro agregado a la Selva");
            }
        });
        agregarCapibaraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Capibara agregado a la Selva");
            }
        });
        agregarPecesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Pez agregado a la Selva");
            }
        });
        agregarSerpienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar un Tigre al panel Selva
                System.out.println("Serpiente agregado a la Selva");
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
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseSobrePanel = true;
                repaint(); // Vuelve a pintar el panel para mostrar la imagen de hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseSobrePanel = false;
                repaint(); // Vuelve a pintar el panel para mostrar la imagen original
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen según el estado del mouse
        if (mouseSobrePanel) {
            g.drawImage(imagenHover.getImage(), 0, 0, getWidth(), getHeight(), this);
        } else {
            g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
    }
}
