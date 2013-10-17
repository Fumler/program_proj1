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
public class ComboBoxRenderer extends JLabel implements ListCellRenderer
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
			setBackground(list.getForeground());
		}
		
		icon = tempImages[selectedIndex];
		setIcon(icon);
		
		// TODO Auto-generated method stub
		return this;
	}
	
}
