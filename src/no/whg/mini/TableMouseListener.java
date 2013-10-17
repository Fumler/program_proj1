/**
 * 
 */
package no.whg.mini;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;

/**
 * @author Fredrik
 *
 */
public class TableMouseListener extends MouseAdapter {
	private JTable table;

	/**
	 * @param table
	 */
	public TableMouseListener(JTable table) {
		this.table = table;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point point = e.getPoint();
		int row = table.rowAtPoint(point);
		table.setRowSelectionInterval(row, row);
	}
	
	
	
	
	
	

}
