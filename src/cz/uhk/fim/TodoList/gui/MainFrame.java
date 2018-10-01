package cz.uhk.fim.TodoList.gui;

import cz.uhk.fim.TodoList.model.TodoItem;
import cz.uhk.fim.TodoList.model.TodoList;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    private JTable table;
    private TodoTableModel model;
    private TodoList todoList;

    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("TodoList App");
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new TodoTableModel();
        todoList = new TodoList();
        model.setList(todoList);


        initControlPanel();
        initContentPanel();
    }

    private void initContentPanel() {
        table = new JTable();
        table.setModel(model);

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void initControlPanel() {
        JPanel controlPanel = new JPanel(new BorderLayout());
        JLabel lblAddTodo = new JLabel("Zadej todo:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        btnAdd.addActionListener(e -> {
            if (txtAddTodo.getText().trim().length() > 0) {
                todoList.addItem(new TodoItem(txtAddTodo.getText().trim()));
                txtAddTodo.setText("");
                model.setList(todoList);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Nelze pridat prázdnou Todo polozku",
                        "Chyba",
                        JOptionPane.WARNING_MESSAGE);
            }

        });

        controlPanel.add(lblAddTodo, BorderLayout.WEST);
        controlPanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPanel.add(btnAdd, BorderLayout.EAST);

        add(controlPanel, BorderLayout.NORTH);

    }
}
