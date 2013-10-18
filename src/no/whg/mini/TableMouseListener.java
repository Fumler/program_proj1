/**
 * 
 */
package no.whg.mini;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;

/**
 * Class that listens for mouse events and deals with them
 * @author Fredrik
 *
 */
public class TableMouseListener extends MouseAdapter {
	private JTable table;

	/**
	 * Class constructor
	 * @param table that is recieved from the Main program
	 */
	public TableMouseListener(JTable table) {
		this.table = table;
	}

	/**
	 * Method that fires when mouse is pressed
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		Point point = e.getPoint();
		int row = table.rowAtPoint(point);
		table.setRowSelectionInterval(row, row);
	}
	
	
	
	
	
	

}
