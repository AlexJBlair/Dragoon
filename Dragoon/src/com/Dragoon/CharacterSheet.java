package com.Dragoon;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;

public class CharacterSheet {
    private JFrame mainFrame;
    public JScrollPane statsScrollPane;
    public JScrollPane infoScrollPane;
    public JTable statsTable;
    public JTable infoTable;
    public DefaultTableModel statsTableModel;
    public DefaultTableModel infoTableModel;

    public CharacterSheet(){
        prepareGUI();
    }

    private void prepareGUI()
    {

        mainFrame = new JFrame("Dragoon");
        mainFrame.setSize(1000,400);
        mainFrame.setLayout(new GridLayout(1, 2));

        mainFrame.setLayout(new FlowLayout());
        mainFrame.setVisible(true);
    }

    public void createStatsTable(String Title)
    {
        statsTableModel = new DefaultTableModel();
        statsTableModel.addColumn("Stat");
        statsTableModel.addColumn("Value");
        statsTable = new JTable(statsTableModel);
        statsTable.getColumnModel().getColumn(1).setWidth(10);

        statsScrollPane = new JScrollPane(statsTable);
        statsScrollPane.setBorder(
            BorderFactory.createTitledBorder
                (
                    BorderFactory.createEtchedBorder(),
                    Title,
                    TitledBorder.CENTER,
                    TitledBorder.TOP
                )
        );
        statsScrollPane.setSize(150, 300);
        mainFrame.add(statsScrollPane, JFrame.LEFT_ALIGNMENT);
        mainFrame.setVisible(true);
    }

    public void addStatToTable(String stat, int value)
    {
        DefaultTableModel model = (DefaultTableModel) statsTable.getModel();
        model.addRow(new Object[]{stat, Integer.toString(value)});
    }

    public void createInfoTable(String Title)
    {
        infoTableModel = new DefaultTableModel();
        infoTable = new JTable(infoTableModel);
        infoTableModel.addColumn("Label");
        infoTableModel.addColumn("Description");

        infoScrollPane = new JScrollPane(infoTable);
        infoScrollPane.setBorder(
                BorderFactory.createTitledBorder
                        (
                                BorderFactory.createEtchedBorder(),
                                Title,
                                TitledBorder.CENTER,
                                TitledBorder.TOP
                        )
        );
        infoScrollPane.setSize(300, 300);
        infoTable.setFillsViewportHeight(true);
        mainFrame.add(infoScrollPane);
        mainFrame.setVisible(true);
    }

    public void addInfoToTable(String label, String description)
    {
        DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
        model.addRow(new Object[]{label, description});
    }
}


