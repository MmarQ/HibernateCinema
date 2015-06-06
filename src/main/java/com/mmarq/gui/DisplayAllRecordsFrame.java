package com.mmarq.gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mmarq.data.TablesNames;

public class DisplayAllRecordsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> tablesNamesComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public DisplayAllRecordsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultComboBoxModel<String> tablesNamesComboBoxModel = new DefaultComboBoxModel<String>();
		for (TablesNames b : TablesNames.values()) {
			tablesNamesComboBoxModel.addElement(b.toString());
		}

		tablesNamesComboBox = new JComboBox<String>(tablesNamesComboBoxModel);
		tablesNamesComboBox.setBounds(36, 20, 356, 42);
		contentPane.add(tablesNamesComboBox);
	}
}
