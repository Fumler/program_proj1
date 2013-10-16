/**
 * 
 */
package no.whg.mini;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 * Class that holds the table itself
 * @author Fredrik, Peer
 *
 */
public class Table extends JTable
{
	private TableModel tableModel;
	private JScrollPane scroll;
	
	public static final String[] columns = { "Type", // 0
			"Variable name", // 1
			"Text", // 2
			"Row", // 3
			"Column", // 4
			"Rows", // 5
			"Columns", // 6
			"Fill", // 7
			"Anchor" // 8
	};
	
	/**
	 * 
	 */
	public Table() {
		tableModel = new TableModel(columns);
		setModel(tableModel);
		setSurrendersFocusOnKeystroke(true);
		
		if(!tableModel.hasEmptyRow()) { 
			// TODO: do this with onClick on add new table thing
			// TODO: tableModel.addEmptyRow();
		}
		
		scroll = new JScrollPane(this);
		setPreferredScrollableViewportSize(new Dimension(500, 300));
	}

	private Object[][] data = {
			{ " ", " "}
	};
	
	public void addRow() {
		
	}

}


