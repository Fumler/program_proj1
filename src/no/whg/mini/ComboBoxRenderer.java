/**
 * 
 */
package no.whg.mini;

import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.io.*;
/**
 * @author PeerAndreas
 *
 */
public class ComboBoxRenderer extends JLabel implements ListCellRenderer, TableCellRenderer
{

	JLabel testImage;
	ImageIcon[] tempImages;
	String[] alignmentConstraints = { "NORTH", "SOUTH", "WEST", "EAST", "NORTHWEST", "NORTHEAST", "SOUTHWEST", "SOUTHEAST", "CENTER"};
	ImageIcon icon;
	String alignment;
	public ComboBoxRenderer()
	{
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	public void setImages(ImageIcon[] temp)
	{
		tempImages = temp;
	}
		

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus)
	{
		int selectedIndex = ((Integer)value).intValue();
		
		if(isSelected)
		{
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		}
		else
		{
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		
		icon = tempImages[selectedIndex];
		setIcon(icon);
		
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Component getTableCellRendererComponent(JTable arg0, Object arg1,
			boolean arg2, boolean arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
 