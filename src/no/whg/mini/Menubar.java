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
		JMenuBar menuBar = new JMenuBar();	//the menubar that holds the menu
		JMenu menu;	//an object of JMenu
		JMenuItem menuItem;	//an object of JMenuItem
		
		menu = new JMenu("File");	//create a menu named file
		add(menu); //add the menu too the menubar
		
		menuItem = new JMenuItem("New", new ImageIcon("gbleditor_icons/NEW.GIF"));	//create an item to the menu with image
		menu.add(menuItem);	//add the item to the menu
		
		menuItem = new JMenuItem("Load", new ImageIcon("gbleditor_icons/OPENDOC.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save As..", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menu.add(menuItem);
		
		menu.addSeparator();	//adds a line separator to the menu
		
		menuItem = new JMenuItem("Preview");	//create an item without the image
		menu.add(menuItem);	//add the item to the menu
		
		menuItem = new JMenuItem("Generate code", new ImageIcon("gbleditor_icons/SAVEJAVA.GIF"));
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Exit");
		menu.add(menuItem);
		
		menu = new JMenu("Edit");	//creates a new menu next to the first
		add(menu);	//add it to the JMenuBar
		
		menuItem = new JMenuItem("Add new row", new ImageIcon("gbleditor_icons/NEWROW.GIF"));
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Preferences");
		menu.add(menuItem);
		
		menu = new JMenu("Help");	//creates a new menu next to the two others
		add(menu);	//add the menu to JMenuBar
		
		menuItem = new JMenuItem("Generate code", new ImageIcon("gbleditor_icons/HELP.GIF"));
		menu.add(menuItem);
		
		menuItem = new JMenuItem("About");
		menu.add(menuItem);
		
	}

}
