package uk.matthewg.ticketclient;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /* First frame */
        JFrame topframe = new JFrame("Book tickets now!");
        JButton searchButton = new JButton("Search");
        JButton aButton = new JButton("a");

        topframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topframe.getContentPane().add(searchButton, BorderLayout.CENTER);

        topframe.getContentPane().add(aButton, BorderLayout.PAGE_START);

        topframe.pack();

        topframe.setVisible(true);

    }

}
