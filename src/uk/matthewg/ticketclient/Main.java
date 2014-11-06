package uk.matthewg.ticketclient;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /* This is creating a new thread to run the GUI later. */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                createAndShowGUI();

            }

        });


    }

    public static void createAndShowGUI(){

        JFrame topFrame = new JFrame("Book tickets");

        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents(topFrame.getContentPane());

        topFrame.pack();

        topFrame.setVisible(true);

    }

    /* Pane is where the components are held inside the JFrame */
    public static void addComponents(Container pane){

        JButton button;

        pane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        /* These are the constraints for button 1*/
        button = new JButton("button1");
        button.setBackground(Color.yellow);
        button.setForeground(Color.PINK);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.2;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);

        /* Constraints for button 2*/
        button = new JButton("button2");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.8;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);

        /* Constraints for b3*/
        button = new JButton("button3");
        button.setBackground(Color.white);
        button.setForeground(Color.blue);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.2;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        /* big button */
        button = new JButton("big RED button");
        button.setBackground(Color.RED);
        button.setForeground(Color.GREEN);
        button.setOpaque(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        /* Allows the component to be taller*/
        c.ipady = 40;
        c.weightx = 0;
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 1;
        pane.add(button, c);

        /*last button*/
        button = new JButton("sidebutton");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.weighty = 1;
        /* Will stop button from being moved  */
        c.anchor = GridBagConstraints.PAGE_END;
        /* insets is padding*/
        c.insets = new Insets (10, 0, 0, 10);
        c.gridx = 1;
        /* Sets the amount of columns the buttons span accross */
        c.gridwidth = 2;
        c.gridy = 2;
        pane.add(button, c);
    }


}

