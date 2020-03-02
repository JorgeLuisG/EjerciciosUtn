package com.company;

import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label;


    int incremento;

    public Ventana() throws HeadlessException{
        add(panel1);
        setTitle("Ventana");
        setSize(550,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        incremento=0;

        button2.addActionListener(e -> {
            incremento--;
            label.setText(""+incremento);


        });

        button1.addActionListener(e -> {

            incremento++;
            label.setText(""+incremento);

        });
    }



}
