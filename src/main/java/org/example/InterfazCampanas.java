package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class InterfazCampanas extends JFrame {
    private JPanel panelComponentes;
    private CopyOnWriteArrayList<String> componentesEnsamblados;

    public InterfazCampanas() {
        setTitle("Ensamblaje de Campanas de Gauss");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        componentesEnsamblados = new CopyOnWriteArrayList<>();  // Lista segura para hilos

        // Panel para mostrar los componentes ensamblados
        panelComponentes = new JPanel();
        panelComponentes.setLayout(new BoxLayout(panelComponentes, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panelComponentes);
        add(scrollPane);

        setVisible(true);
    }

    // Método para añadir un componente ensamblado
    public void agregarComponente(String componente) {
        componentesEnsamblados.add(componente);
        JLabel label = new JLabel("Componente ensamblado: " + componente);
        panelComponentes.add(label);
        panelComponentes.revalidate();  // Revalidar el panel
        panelComponentes.repaint();     // Repintar el panel
    }
}
