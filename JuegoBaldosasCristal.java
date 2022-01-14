package juegoCalamarConInterfaz;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class JuegoBaldosasCristal {
    private JPanel panelPrincipal;
    private JPanel panelInformacion;
    private JPanel panelPuente;
    private JLabel baldosa1A;
    private JLabel baldosa1B;
    private JLabel baldosa2A;
    private JLabel baldosa2B;
    private JLabel baldosa3A;
    private JLabel baldosa3B;
    private JLabel baldosa4A;
    private JLabel baldosa4B;
    private JLabel baldosa5A;
    private JLabel baldosa5B;
    private JLabel baldosa6A;
    private JLabel baldosa6B;
    private JLabel baldosa7A;
    private JLabel baldosa7B;
    private JLabel baldosa8A;
    private JLabel baldosa8B;
    private JLabel baldosa9A;
    private JLabel baldosa9B;
    private JLabel baldosa10A;
    private JLabel baldosa10B;
    private JLabel baldosa11A;
    private JLabel baldosa11B;
    private JLabel baldosa12A;
    private JLabel baldosa12B;
    private JLabel baldosa13A;
    private JLabel baldosa13B;
    private JLabel baldosa14A;
    private JLabel baldosa14B;
    private JLabel baldosa15A;
    private JLabel baldosa15B;
    private JLabel baldosa16A;
    private JLabel baldosa16B;
    private JLabel baldosa17A;
    private JLabel baldosa17B;
    private JLabel baldosa18A;
    private JLabel baldosa18B;
    private JLabel etiquetaInformacion;
    private JButton botonComenzar;
    private JPanel panelInicio;
    private JPanel panelFinal;
    private JLabel etiquetaFinal;
    private JLabel etiquetaInicio;
    private JPanel panelInfo;
    private JLabel nombreJuego;

    public JLabel getBaldosa1A() {
        return baldosa1A;
    }

    public JLabel getBaldosa1B() {
        return baldosa1B;
    }

    public JLabel getBaldosa2A() {
        return baldosa2A;
    }

    public JLabel getBaldosa2B() {
        return baldosa2B;
    }

    public JLabel getBaldosa3A() {
        return baldosa3A;
    }

    public JLabel getBaldosa3B() {
        return baldosa3B;
    }

    public JLabel getBaldosa4A() {
        return baldosa4A;
    }

    public JLabel getBaldosa4B() {
        return baldosa4B;
    }

    public JLabel getBaldosa5A() {
        return baldosa5A;
    }

    public JLabel getBaldosa5B() {
        return baldosa5B;
    }

    public JLabel getBaldosa6A() {
        return baldosa6A;
    }

    public JLabel getBaldosa6B() {
        return baldosa6B;
    }

    public JLabel getBaldosa7A() {
        return baldosa7A;
    }

    public JLabel getBaldosa7B() {
        return baldosa7B;
    }

    public JLabel getBaldosa8A() {
        return baldosa8A;
    }

    public JLabel getBaldosa8B() {
        return baldosa8B;
    }

    public JLabel getBaldosa9A() {
        return baldosa9A;
    }

    public JLabel getBaldosa9B() {
        return baldosa9B;
    }

    public JLabel getBaldosa10A() {
        return baldosa10A;
    }

    public JLabel getBaldosa10B() {
        return baldosa10B;
    }

    public JLabel getBaldosa11A() {
        return baldosa11A;
    }

    public JLabel getBaldosa11B() {
        return baldosa11B;
    }

    public JLabel getBaldosa12A() {
        return baldosa12A;
    }

    public JLabel getBaldosa12B() {
        return baldosa12B;
    }

    public JLabel getBaldosa13A() {
        return baldosa13A;
    }

    public JLabel getBaldosa13B() {
        return baldosa13B;
    }

    public JLabel getBaldosa14A() {
        return baldosa14A;
    }

    public JLabel getBaldosa14B() {
        return baldosa14B;
    }

    public JLabel getBaldosa15A() {
        return baldosa15A;
    }

    public JLabel getBaldosa15B() {
        return baldosa15B;
    }

    public JLabel getBaldosa16A() {
        return baldosa16A;
    }

    public JLabel getBaldosa16B() {
        return baldosa16B;
    }

    public JLabel getBaldosa17A() {
        return baldosa17A;
    }

    public JLabel getBaldosa17B() {
        return baldosa17B;
    }

    public JLabel getBaldosa18A() {
        return baldosa18A;
    }

    public JLabel getBaldosa18B() {
        return baldosa18B;
    }

    public JButton getBotonComenzar() {
        return botonComenzar;
    }

    public JLabel getEtiquetaInformacion() {
        return etiquetaInformacion;
    }



    public JuegoBaldosasCristal() {
        JFrame frame = new JFrame();
        frame.setTitle("Juego del Calamar");
        frame.setContentPane(panelPrincipal);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width, dimension.height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
