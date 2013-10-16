/**
 * 
 */
package no.whg.mini;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
/**
 * Class that handles the toolbar of the program, save buttons etc
 * @author Fredrik, Peer
 *
 */
public class Toolbar extends JToolBar {
	
	
	public Toolbar()
	{
		JToolBar toolBar = new JToolBar();
		toolBar.setPreferredSize(new Dimension(400,50));
		setFloatable(false);
		setRollover(true);
		JButton newButton = null;
		
		ImageIcon newImage = new ImageIcon("gbleditor_icons/NEW.GIF");
		newButton = new JButton(newImage);
		newButton.setMinimumSize(new Dimension(20,20));
		newButton.setMaximumSize(new Dimension(40,40));
		newButton.setToolTipText("Create a new layout");
		add(newButton);
		
		ImageIcon newRowImage = new ImageIcon("gbleditor_icons/NEWROW.GIF");
		newButton = new JButton(newRowImage);
		newButton.setMinimumSize(new Dimension(20,20));
		newButton.setMaximumSize(new Dimension(40,40));
		newButton.setToolTipText("Add a new row");
		add(newButton);
	}
	

}
