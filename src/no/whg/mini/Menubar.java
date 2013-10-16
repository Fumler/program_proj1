/**
 * 
 */
package no.whg.mini;

import javax.swing.*;
/**
 * @author PeerAndreas
 *
 */
public class Menubar extends JMenuBar
{
	public Menubar()
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;
		JMenuItem menuItem;
		
		menu = new JMenu("File");
		add(menu);
		
		menuItem = new JMenuItem("New", new ImageIcon("gbleditor_icons/NEW.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Load", new ImageIcon("gbleditor_icons/OPENDOC.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save As..", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Preview");
		
		menu = new JMenu("Edit");
		
		
		
		
	}

}
