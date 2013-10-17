/**
 * 
 */
package no.whg.mini;

import java.awt.Component;

import javax.swing.*;

/**
 * @author PeerAndreas
 *
 */
public class ComboBoxRenderer extends JLabel implements ListCellRenderer 
{

	public ComboBoxRenderer()
	{
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
