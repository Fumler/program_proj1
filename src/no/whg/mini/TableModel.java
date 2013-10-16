/**
 * 
 */
package no.whg.mini;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 * Class that manipulates the table and holds all the "table" objects
 * 
 * @author Fredrik
 * 
 */
public class TableModel extends AbstractTableModel {

	private String[] columns;
	private Vector<TableData> dataVector;

	/**
	 * @param columns
	 *            List of column names
	 */
	public TableModel(String[] columns) {
		this.columns = columns;
		dataVector = new Vector<TableData>();
	}

	/**
	 * @param column
	 *            Index of column
	 */
	public String getColumnName(int column) {
		return columns[column];
	}

	public void setValue(Object value, int row, int column) {
		TableData data = (TableData) dataVector.get(row);
		switch (column) {
		case 0:
			data.setType((String) value);
			break;
		case 1:
			data.setVarName((String) value);
			break;
		case 2:
			data.setText((String) value);
			break;
		case 3:
			data.setRow((int) value);
			break;
		case 4:
			data.setColumn((int) value);
			break;
		case 5:
			data.setRows((int) value);
			break;
		case 6:
			data.setColumns((int) value);
			break;
		case 7:
			data.setFill((String) value);
			break;
		case 8:
			data.setAnchor((String) value);
			break;
		default:
			System.out.println(":::ERROR:: index not found");
		}
		fireTableCellUpdated(row, column);
	}

	public Object getValue(int row, int column) {
		TableData data = (TableData) dataVector.get(row);

		switch (column) {
		case 0:
			return data.getType();
		case 1:
			return data.getVarName();
		case 2:
			return data.getText();
		case 3:
			return data.getRow();
		case 4:
			return data.getColumn();
		case 5:
			return data.getRows();
		case 6:
			return data.getColumns();
		case 7:
			return data.getFill();
		case 8:
			return data.getAnchor();
		default:
			return new Object();
		}
	}
	
	public boolean hasEmptyRow() {
		if(dataVector.size() == 0)
			return false;
		
		TableData data = (TableData) dataVector.get(dataVector.size() - 1);
		
		// hacky
		if (data.getType().trim().equals("") &&
				data.getVarName().trim().equals("") &&
				data.getText().trim().equals("") &&
				data.getFill().trim().equals("") &&
				data.getAnchor().trim().equals("")) {
			
			return true;
		}
		else
			return false;
	}
	
	public void addEmptyRow() {
		dataVector.add(new TableData());
		fireTableRowsInserted(dataVector.size() -1, dataVector.size() - 1);
	}

	public boolean isCellEditable(int row, int column) {
		return true;
	}

	@Override
	public int getRowCount() {
		return dataVector.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
