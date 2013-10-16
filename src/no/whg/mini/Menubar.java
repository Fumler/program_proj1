/**
 * 
 */
package no.whg.mini;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
/**
 * @author PeerAndreas
 *
 */
public class Menubar extends JMenuBar implements ActionListener, ItemListener
{
	public Menubar()
	{
		JMenuBar menuBar = new JMenuBar();	//the menubar that holds the menu
		JMenu menu;	//an object of JMenu
		JMenuItem menuItem;	//an object of JMenuItem
		
		menu = new JMenu("File");	//create a menu named file
		menu.setMnemonic(KeyEvent.VK_F);
		add(menu); //add the menu too the menubar
		
		menuItem = new JMenuItem("New", new ImageIcon("gbleditor_icons/NEW.GIF"));	//create an item to the menu with image
		menuItem.addActionListener(this);
		menu.add(menuItem);	//add the item to the menu
		
		menuItem = new JMenuItem("Load", new ImageIcon("gbleditor_icons/OPENDOC.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save As..", new ImageIcon("gbleditor_icons/SAVE.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu.addSeparator();	//adds a line separator to the menu
		
		menuItem = new JMenuItem("Preview");	//create an item without the image
		menuItem.addActionListener(this);
		menu.add(menuItem);	//add the item to the menu
		
		menuItem = new JMenuItem("Generate code", new ImageIcon("gbleditor_icons/SAVEJAVA.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Exit");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu = new JMenu("Edit");	//creates a new menu next to the first
		add(menu);	//add it to the JMenuBar
		
		menuItem = new JMenuItem("Add new row", new ImageIcon("gbleditor_icons/NEWROW.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Preferences");
		menu.add(menuItem);
		
		menu = new JMenu("Help");	//creates a new menu next to the two others
		add(menu);	//add the menu to JMenuBar
		
		menuItem = new JMenuItem("Help", new ImageIcon("gbleditor_icons/HELP.GIF"));
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("About");
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
	}
	


	@Override
	public void itemStateChanged(ItemEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getActionCommand() == "New")
		{
			
		}
		else if(e.getActionCommand() == "Load")
		{
			JFileChooser openWindow = new JFileChooser();	//create a new FileChooser
			int rVal = openWindow.showOpenDialog(Menubar.this);	//creates a window for opening files
			
		}
		else if(e.getActionCommand() == "Save")
		{
			
		}
		else if(e.getActionCommand() == "Save As..")
		{
			JFileChooser saveAsWindow = new JFileChooser();	//create a new FileChooser
			int rVal = saveAsWindow.showSaveDialog(Menubar.this);	//creates a window for saving files and specify name
		}
		else if(e.getActionCommand() == "Preview")
		{
			
		}
		else if(e.getActionCommand() == "Generate Code")
		{
			
		}
		else if(e.getActionCommand() == "Exit")
		{
			System.exit(0);	//exit program
		}
		
	}


}
