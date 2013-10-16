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
		
		setSize(400,30);
		ImageIcon newImage = new ImageIcon("NEW.GIF");
		JButton newButton = new JButton(newImage);
		newButton.setSize(50,50);
		add(newButton);
		
		ImageIcon newRowImage = new ImageIcon("NEWROW.GIF");
		newButton = new JButton(newRowImage);
		newButton.setSize(50,50);
		
		
		add(newButton);
	}
	

}
