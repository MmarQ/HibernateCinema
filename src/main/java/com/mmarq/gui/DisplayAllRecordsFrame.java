package com.mmarq.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import com.mmarq.data.TableName;
import com.mmarq.manage.Manager;
import com.mmarq.manage.ManagerFactory;
import com.mmarq.tablesModels.TableModel;

import javax.swing.JButton;

public class DisplayAllRecordsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> tablesNamesComboBox;
	private JTable allRecordsDisplayTable;
	private TableModel tableModel;
	/**
	 * Create the frame.
	 */
	public DisplayAllRecordsFrame(boolean deleteButtonVisible) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 764, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultComboBoxModel<String> tablesNamesComboBoxModel = new DefaultComboBoxModel<String>();
		for (TableName b : TableName.values()) {
			tablesNamesComboBoxModel.addElement(b.getTableName());
		}
		
		tablesNamesComboBox = new JComboBox<String>(tablesNamesComboBoxModel);
		tablesNamesComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				refresh();
			}
		});
		tablesNamesComboBox.setBounds(175, 33, 356, 42);
		contentPane.add(tablesNamesComboBox);
		
		
		tableModel = new TableModel(TableName.fromString((String) tablesNamesComboBoxModel.getSelectedItem()));
		allRecordsDisplayTable = new JTable(tableModel);
		allRecordsDisplayTable.setBounds(36, 109, 633, 145);
		resizeColumnWidth(allRecordsDisplayTable);
		
		contentPane.add(allRecordsDisplayTable);
		
		JButton deleteRecordButton = new JButton("Usu\u0144");
		deleteRecordButton.setVisible(deleteButtonVisible);
		deleteRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = allRecordsDisplayTable.getSelectedRow();
				if(row == -1){
					System.out.println("Oops");
				}else{
					int data = (int) allRecordsDisplayTable.getValueAt(row, 0);
					Manager manager = ManagerFactory.getManager(TableName.fromString((String) tablesNamesComboBox.getSelectedItem()));
					manager.delete(data);
				}
				
				
			}
		});
		deleteRecordButton.setBounds(285, 279, 165, 37);
		contentPane.add(deleteRecordButton);
	}
	private void refresh(){
		tableModel = new TableModel(TableName.fromString((String)tablesNamesComboBox.getSelectedItem()));
		allRecordsDisplayTable.setModel(tableModel);
		resizeColumnWidth(allRecordsDisplayTable);
	}
	public void resizeColumnWidth(JTable table) {
	    final TableColumnModel columnModel = table.getColumnModel();
	    for (int column = 0; column < table.getColumnCount(); column++) {
	        int width = 50; // Min width
	        for (int row = 0; row < table.getRowCount(); row++) {
	            TableCellRenderer renderer = table.getCellRenderer(row, column);
	            Component comp = table.prepareRenderer(renderer, row, column);
	            width = Math.max(comp.getPreferredSize().width, width);
	        }
	        columnModel.getColumn(column).setPreferredWidth(width);
	    }
	}
}
