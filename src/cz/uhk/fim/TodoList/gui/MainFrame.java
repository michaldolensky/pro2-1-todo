package cz.uhk.fim.TodoList.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("TodoList App");
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initControlPanel();
    }

    private void initControlPanel(){
        JPanel controlPaanel = new JPanel(new BorderLayout());
        JLabel lblAddTodo = new JLabel("Zadej todo:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("pridat");

        controlPaanel.add(lblAddTodo,BorderLayout.WEST);
        controlPaanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPaanel.add(btnAdd,BorderLayout.EAST);

        add(controlPaanel,BorderLayout.NORTH);

    }
}
