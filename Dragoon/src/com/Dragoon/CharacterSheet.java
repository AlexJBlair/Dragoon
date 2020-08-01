package com.Dragoon;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;


public class CharacterSheet {

    public CharacterSheet(){
        prepareGUI();
    }

    private void prepareGUI()
    {
        // Main Window
        JFrame frame = new JFrame("Dragoon");

        JPanel pane = new JPanel();
        pane.setLayout(new GridBagLayout());
        new GridBagLayout();

        GridBagConstraints c = new GridBagConstraints();

        // Left aligned table

        String selections[][] = {
                {"these"},
                {"will"},
                {"be"},
                {"the"},
                {"types"},
                {"of"},
                {"stuff"},
                {"you"},
                {"can"},
                {"change"}
        };
        String col_label[] = {"Options"};
        JTable left_column_table = new JTable(selections, col_label);
        Font font = new Font("TimesRoman", Font.BOLD, 24);
        for(int i=0; i<selections.length; i++)
        {
            left_column_table.setRowHeight(i, 40);
            left_column_table.setFont(font);
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 700;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 10;
        c.weighty = 10;
        c.weightx = 2;
        pane.add(left_column_table, c);


        // First Upper Right table

        String stat_values[][] = {
                {"these"},
                {"will"},
                {"be"},
                {"the"},
                {"values"},
                {"of"},
                {"unique"},
                {"things"},
                {"that"},
                {"you"},
                {"can"},
                {"modify"}
        };
        String stat_col_label[] = {"Options"};
        JTable upper_right_stats_table = new JTable(stat_values, stat_col_label);
        font = new Font("TimesRoman", Font.PLAIN, 18);
        for(int i=0; i<stat_values.length; i++)
        {
            upper_right_stats_table.setRowHeight(i, 20);
            upper_right_stats_table.setFont(font);
        }
        c.ipady = (int) (700 * 0.8);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 8;
        c.weighty = 8;
        c.weightx = 1;
        pane.add(upper_right_stats_table, c);


        // Second Upper Right table

        String stat_names[][] = {
                {"these"},
                {"will"},
                {"be"},
                {"the"},
                {"name and short description"},
                {"of"},
                {"unique"},
                {"things"},
                {"that"},
                {"you"},
                {"can"},
                {"modify"}
        };
        String stat_names_col_label[] = {"Options"};
        JTable upper_right_names_table = new JTable(stat_names, stat_names_col_label);
        font = new Font("TimesRoman", Font.PLAIN, 18);
        for(int i=0; i<stat_names.length; i++)
        {
            upper_right_names_table.setRowHeight(i, 20);
            upper_right_names_table.setFont(font);
        }
        c.ipady = (int) (700 * 0.8);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 7;
        c.gridheight = 8;
        c.weighty = 8;
        c.weightx = 7;
        pane.add(upper_right_names_table, c);



        // Lower right table
        String text = "This will be an in depth description of the stat you might want to modify.";
        text += " also maybe just a general status/info pane idk...";
        JTextField lower_right_text = new JTextField(text);
        font = new Font("TimesRoman", Font.PLAIN, 12);
        lower_right_text.setFont(font);

        c.ipady = (int) (700 * 0.2);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 8;
        c.gridwidth = 8;
        c.gridheight = 2;
        c.weighty = 2;
        c.weightx = 9;
        pane.add(lower_right_text, c);


        frame.add(pane);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}


