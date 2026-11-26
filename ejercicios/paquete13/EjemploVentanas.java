package ejercicios.paquete13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

// Ventana principal: al heredar de JFrame, 'this' ES la ventana
public class EjemploVentanas extends JFrame {

    public EjemploVentanas() {
        super("Ventana principal");               // título de la ventana
        setSize(400, 150);
        setLocationRelativeTo(null);                // null = centrada en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // cerrar la ventana termina el programa
        setLayout(new FlowLayout());                // coloca los botones uno al lado del otro

        JButton botonAnonima = new JButton("Clase anónima");
        JButton botonLambda = new JButton("Lambda");
        JButton botonDialogo = new JButton("Diálogo propio");

        // FORMA 1: clase anónima (una clase interna sin nombre).
        // Dentro, 'this' sería el ActionListener, así que para referirnos
        // a la ventana necesitamos EjemploVentanas.this (como Pedido.this)
        botonAnonima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(EjemploVentanas.this, "Hola desde una clase anónima");
            }
        });

        // FORMA 2: lambda. No crea un 'this' propio: 'this' sigue siendo la ventana
        botonLambda.addActionListener(e -> JOptionPane.showMessageDialog(this, "Hola desde una lambda"));

        // FORMA 3: un diálogo hecho a mano, con la ventana principal como dueña
        botonDialogo.addActionListener(e -> abrirDialogo());

        add(botonAnonima);
        add(botonLambda);
        add(botonDialogo);
    }

    private void abrirDialogo() {
        // 'this' = dueña del diálogo. true = modal (bloquea la principal mientras está abierto)
        JDialog dialogo = new JDialog(this, "Ventana secundaria", true);
        dialogo.setSize(250, 120);
        dialogo.setLayout(new FlowLayout());
        dialogo.add(new JLabel("Estoy centrada sobre mi dueña"));

        JButton cerrar = new JButton("Cerrar");
        cerrar.addActionListener(e -> dialogo.dispose()); // dispose() cierra solo el diálogo
        dialogo.add(cerrar);

        dialogo.setLocationRelativeTo(this); // centrada sobre la ventana principal
        dialogo.setVisible(true);
    }

    public static void main(String[] args) {
        // Las ventanas de Swing se crean en su propio hilo (el de la interfaz):
        // otra lambda, como las de los Thread de hoy
        SwingUtilities.invokeLater(() -> new EjemploVentanas().setVisible(true));
    }
}
