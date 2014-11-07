package uk.matthewg.ticketclient.handlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Matthew on 06/11/2014.
 */
public class GUIhandler {

    public static JTextField searchBox;
    public static JLabel title;
    public static JComboBox numberOfResultsSelector;
    public static JTable displayEvents;

    public static JButton searchButton;
    public static JButton optionsButton;
    public static JButton nextButton;
    public static JButton previousButton;

    static String beforeSearch = "Type in your search here.";
    public static String savedString;

    public GUIhandler() {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                createAndShowGUI();

            }

        });

    }


    public void createAndShowGUI() {

        JFrame frame = new JFrame("Book Tickets");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents(frame.getContentPane());

        frame.pack();

        frame.setVisible(true);

    }

    public static void addComponents(Container pane) {


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

        searchButton = new JButton("Search");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(searchButton, c);


        optionsButton = new JButton("Options");
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

                {"Ape Hunter", "A fast paced ape hunting event. Are you the alpha male? Are you gonna go ape? Then this is the event for you."},
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

        previousButton = new JButton("Previous");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 4;
        c.anchor = GridBagConstraints.PAGE_END;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(previousButton, c);

        nextButton = new JButton("Next");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 4;
        c.anchor = GridBagConstraints.PAGE_END;
        c.insets = new Insets(5, 5, 5, 5);
        pane.add(nextButton, c);



        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                savedString = searchBox.getText();
                System.out.println(savedString);
                String searchCheck = searchBox.getText();

                if (searchCheck == "")
                {
                    /*print all events to JTable*/
                }
            }
        });

        optionsButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                searchBox.setText("options");
                /* open up another java dialog for selecting server*/
            }
        });



        searchBox.addMouseListener(new MouseAdapter() {


                                       @Override
                                       public void mousePressed(MouseEvent event) {

                                           String searchCheck = searchBox.getText();

                                           if (searchCheck.equals(beforeSearch))
                                           {
                                               searchBox.setText("");
                                           }
                                }

                      }
        );

    }

}

