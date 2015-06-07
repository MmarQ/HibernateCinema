package com.mmarq.tablesModels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.Data;
import com.mmarq.data.HibernateUtils;
import com.mmarq.data.TableName;

public class TableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Data> recordsList;
	private TableName tableName;

	public TableModel(TableName tableName) {
		super();
		this.tableName = tableName;
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Query q = session.createQuery("from "+this.tableName.toString());
		recordsList = new ArrayList<Data>(q.list());

		session.close();
		sf.close();
	}

	public TableName getTableName() {
		return tableName;
	}

	public void setTableName(TableName tableName) {
		this.tableName = tableName;
	}
	@Override
	public int getRowCount() {
		return recordsList.size();
	}
	@Override
	public int getColumnCount() {
		return TableModelFactory.getNumberOfColumns(tableName);
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object[] values = TableModelFactory.getValueAt(tableName, recordsList, rowIndex);
		return values[columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		String[] columnNames = TableModelFactory.getColumnsNames(tableName);
		return columnNames[column];
	}
	
}
