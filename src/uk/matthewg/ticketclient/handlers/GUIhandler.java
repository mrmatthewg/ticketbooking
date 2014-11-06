package uk.matthewg.ticketclient.handlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Matthew on 06/11/2014.
 */
public class GUIhandler {

    public static JTextField searchBox;
    public static JLabel title;
    public static JComboBox numberOfResultsSelector;
    public static JTable displayEvents;
    public GUIhandler() {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                createAndShowGUI();

            }

        });

    }

    public static void createAndShowGUI(){

        JFrame frame = new JFrame("Book Tickets");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents(frame.getContentPane());

        frame.pack();

        frame.setVisible(true);

    }

    public  static void addComponents(Container pane){


        pane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        searchBox = new JTextField("Type in your search here.");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 5, 0, 0);
        
        pane.add(searchBox, c);

        JButton searchButton = new JButton("Search");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(searchButton, c);

        JButton optionsButton = new JButton("Options");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(optionsButton, c);


        title = new JLabel("Results");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(0, 5, 0, 0);
        pane.add(title, c);

        String[] numberOfResults = {"10", "20", "50"};
        numberOfResultsSelector = new JComboBox(numberOfResults);
        numberOfResultsSelector.setSelectedIndex(0);
        numberOfResultsSelector.setName("Select Number of Events");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(numberOfResultsSelector, c);



        String[] columnNames = {"Title", "Description"};
        String[][] data = {

                {"Apes of men", "A fast paced movie about apes becoming men. Little girl lucy befriends apeman George in the coming of the rainbow unicorn lord"},
                {"Ultimate bowling", "Many people bowl. Such bowling. Alas. For people who love to bowl. I eat from bowls. We eat from bowls. 100 chars please"},
                {"Trolly hunting", "People around portsmouth, seek out wild trollies. In the great catacombs known as fratton. Please avoid knife wilding adolescent children."}

        };

        displayEvents = new JTable(data, columnNames);
        displayEvents.setPreferredScrollableViewportSize(new Dimension(600, 600));
        displayEvents.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(displayEvents);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 4;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(scrollPane, c);

        JButton previousButton = new JButton("Previous");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 4;
        c.anchor = GridBagConstraints.PAGE_END;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(previousButton, c);

        JButton nextButton = new JButton("Next");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 4;
        c.anchor = GridBagConstraints.PAGE_END;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(nextButton, c);


    }


}
