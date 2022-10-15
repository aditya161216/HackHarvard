package View;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class View {
    private JPanel mainPanel;
    private JPanel image;
    private JPanel description;
    private JPanel stats;
    private JPanel buttons;
    private JButton no;
    private JButton yes;
    private JButton replay;

    public View() {
        init();
    }

    public void init() {
        setTitle("Tinder for sports");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainScrollPane = new JScrollPane(mainPanel);
        this.add(mainScrollPane, BorderLayout.CENTER);
        setVisible(true);

    }

    public static void main(String[]args) {
        View v = new View();

    }
}