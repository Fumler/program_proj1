/**
 * 
 */
package no.whg.mini;

import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;

/**
 * @author PeerAndreas
 *
 */
public class ComboBoxRenderer extends JLabel implements TableCellRenderer
{

	JLabel testImage;
	ImageIcon[] tempImages;
	ImageIcon icon;
	public ComboBoxRenderer()
	{
		icon = new ImageIcon("gbleditor_icons/anchor_center.png");
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	public void setImages(ImageIcon[] temp)
	{
		tempImages = temp;
	}
	

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) 
	{
		
		
		if(isSelected)
		{
			setBackground(Color.red);
			setIcon(icon);
		}
		
		
		
		
		
		// TODO Auto-generated method stub
		return this;
	}
	
}
