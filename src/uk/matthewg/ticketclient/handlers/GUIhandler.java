package uk.matthewg.ticketclient.handlers;

import javax.swing.*;
import java.awt.*;

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

        searchBox = new JTextField("Type in your search and press enter.");

        pane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 5, 0, 0);
        pane.add(searchBox, c);

        JButton optionsButton = new JButton("Options");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(optionsButton, c);

        title = new JLabel("Results");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(0, 5, 0, 0);
        pane.add(title, c);

        String[] numberOfResults = {"10", "20", "50"};
        numberOfResultsSelector = new JComboBox(numberOfResults);
        numberOfResultsSelector.setSelectedIndex(0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(numberOfResultsSelector, c);

        String[] columnNames = {"Title", "Description"};
        String[][] data = {

                {"Apes of men", "A fast paced movie about apes becoming men. Little girl lucy befriends apeman George in the coming of the rainbow unicorn lord"},
                {"Ultimate bowling", "Many people bowl. Such bowling. Alas. For people who love to bowl. I eat from bowls. We eat from bowls. 100 chars please"},
                {"Trolly hunting", "People around portsmouth, seek out wild trollies. In the great catacombs known as fratton. Please avoid knife wilding adolescent children."}

        };

        displayEvents = new JTable(data, columnNames);
        displayEvents.setPreferredScrollableViewportSize(new Dimension(800, 600));
        displayEvents.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(displayEvents);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 4;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(scrollPane, c);


    }


}
