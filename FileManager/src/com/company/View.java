package com.company;

import javax.swing.*;

public class View {
    private Controller controller;
    private JList<String> list;
    private JButton backButton;
    private JLabel label;

    public void create() {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        list = new JList<>();
        JScrollPane pane = new JScrollPane(list);
        pane.setBounds(50, 60, 400, 400);
        frame.add(pane);

        backButton = new JButton("Back");
        backButton.setBounds(135, 490, 100, 50);
        backButton.addActionListener(e -> controller.handleBackButtonClick());
        frame.add(backButton);

        JButton openButton = new JButton("Open");
        openButton.setBounds(255, 490, 100, 50);
        openButton.addActionListener(e -> controller.handleOpenButtonClick());
        frame.add(openButton);

        label = new JLabel();
        label.setBounds(30, 10, 400, 50);
        frame.add(label);

        frame.setVisible(true);
    }

    public void setListData(String[] data) {
        list.setListData(data);
    }

    public String getNextPath() {
        return list.getSelectedValue();
    }

    public void enableBackButton(boolean bool) {
        backButton.setEnabled(bool);
    }

    public void setLabelText(String string) {
        label.setText(string);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
