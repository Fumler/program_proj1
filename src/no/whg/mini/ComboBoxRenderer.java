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

	ImageIcon[] tempImages;
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
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus)
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
		
		ImageIcon icon = tempImages[selectedIndex];
		setIcon(icon);
		
		
		// TODO Auto-generated method stub
		return this;
	}
	
}
