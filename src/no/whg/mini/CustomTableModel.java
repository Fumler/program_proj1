/**
 * 
 */
package no.whg.mini;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 * Class that manipulates the table and holds all the "table" objects
 * 
 * @author Fredrik
 * 
 */
public class CustomTableModel extends AbstractTableModel {

    private Vector<TableData> dataVector = new Vector<TableData>();
    JFrame mainFrame;

    public static final String[] columns = { 
        Messages.getString("Table.type"), // 0
        Messages.getString("Table.varName"), // 1
        Messages.getString("Table.text"), // 2
        Messages.getString("Table.row"), // 3
        Messages.getString("Table.column"), // 4
        Messages.getString("Table.rows"), // 5
        Messages.getString("Table.columns"), // 6
        Messages.getString("Table.fill"), // 7
        Messages.getString("Table.anchor") // 8
    };

    /**
     * @param column
     *            Index of column
     */
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void addRow() {
        TableData data = new TableData("Var" + (dataVector.size() + 1));
        dataVector.add(data);
        fireTableRowsInserted(dataVector.size(), dataVector.size());
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
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
            data.setRow((String) value);
            break;
        case 4:
            data.setColumn((String) value);
            break;
        case 5:
            data.setRows((String) value);
            break;
        case 6:
            data.setColumns((String) value);
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
    
    @Override
    public Object getValueAt(int row, int column) {
        TableData data = dataVector.get(row);

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
    
    public void setTableFrame(JFrame f) {
        mainFrame = f;
    }
    
    @Override
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


}
