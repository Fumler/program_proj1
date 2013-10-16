/**
 * 
 */
package no.whg.mini;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JToolBar;
import javax.swing.JButton;
/**
 * Class that handles the toolbar of the program, save buttons etc
 * @author Fredrik, Peer
 *
 */
public class Toolbar extends JToolBar implements ActionListener, ItemListener
{
	File currentFile;
	public Toolbar()
	{
		JToolBar toolBar = new JToolBar();
		toolBar.setMinimumSize(new Dimension(400, 50));
		toolBar.setMaximumSize(new Dimension(400,80));
		setFloatable(true);
		setRollover(true);
		
		JButton newButton = new JButton();
		
		ImageIcon newImage = new ImageIcon("gbleditor_icons/NEW.GIF");
		newButton = new JButton(newImage);
		newButton.setToolTipText("Create a new layout");
		newButton.setActionCommand("new");
		newButton.addActionListener(this);
		add(newButton);
		
		ImageIcon newOpenImage = new ImageIcon("gbleditor_icons/OPENDOC.GIF");
		newButton = new JButton(newOpenImage);	
		newButton.setToolTipText("Open document");
		newButton.setActionCommand("open");
		newButton.addActionListener(this);
		add(newButton);
		
		ImageIcon newSaveImage = new ImageIcon("gbleditor_icons/SAVE.GIF");
		newButton = new JButton(newSaveImage);
		newButton.setToolTipText("Save");
		newButton.setActionCommand("save");
		newButton.addActionListener(this);
		add(newButton);
		
		addSeparator();
		
		ImageIcon newSaveJavaImage = new ImageIcon("gbleditor_icons/SAVEJAVA.GIF");
		newButton = new JButton(newSaveJavaImage);
		newButton.setToolTipText("Generate the code");
		newButton.setActionCommand("generate");
		newButton.addActionListener(this);
		add(newButton);
		
		ImageIcon newExecuteImage = new ImageIcon("gbleditor_icons/ExecuteProject.GIF");
		newButton = new JButton(newExecuteImage);
		newButton.setToolTipText("Run the program");
		newButton.setActionCommand("run");
		newButton.addActionListener(this);
		add(newButton);
		
		addSeparator();
		
		ImageIcon newRowImage = new ImageIcon("gbleditor_icons/NEWROW.GIF");
		newButton = new JButton(newRowImage);
		newButton.setToolTipText("Add a new row");
		newButton.setActionCommand("newRow");
		newButton.addActionListener(this);
		add(newButton);
		
		ImageIcon newRowDownImage = new ImageIcon("gbleditor_icons/MoveRowDown.GIF");
		newButton = new JButton(newRowDownImage);
		newButton.setToolTipText("Move row down");
		newButton.setActionCommand("rowDown");
		newButton.addActionListener(this);
		add(newButton);
		
		ImageIcon newRowUpImage = new ImageIcon("gbleditor_icons/MoveRowUp.GIF");
		newButton = new JButton(newRowUpImage);
		newButton.setToolTipText("Move row up");
		newButton.setActionCommand("rowUp");
		newButton.addActionListener(this);
		add(newButton);
		
		addSeparator();
		
		ImageIcon newHelpImage = new ImageIcon("gbleditor_icons/HELP.GIF");
		newButton = new JButton(newHelpImage);
		newButton.setToolTipText("Help");
		newButton.setActionCommand("help");
		newButton.addActionListener(this);
		add(newButton);
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == "new")
		{
			
		}
		else if(e.getActionCommand() == "open")
		{
			JFileChooser openWindow = new JFileChooser();	//create a FileChooser
			int rVal = openWindow.showOpenDialog(Toolbar.this);	//creates a window for opening files
			
		}
		else if(e.getActionCommand() == "save")
		{
			if(currentFile != null)
			{
				try 
				{
					FileOutputStream fileOutput = new FileOutputStream(currentFile);
					ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
					objectOutput.writeObject(null);
					objectOutput.close();
					fileOutput.close();
				}
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				JFileChooser saveAsWindow = new JFileChooser();	//create a new FileChooser
				int rVal = saveAsWindow.showSaveDialog(Toolbar.this);	//creates a window for saving files and specify name
				
				if(rVal == JFileChooser.APPROVE_OPTION)
				{
					currentFile = saveAsWindow.getSelectedFile();
					
					try 
					{
						FileOutputStream fileOutput = new FileOutputStream(currentFile);
						ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
						objectOutput.writeObject(null);
						objectOutput.close();
						fileOutput.close();
					}
					catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		else if(e.getActionCommand() == "generate")
		{
			
		}
		else if(e.getActionCommand() == "run")
		{
			
		}
		else if(e.getActionCommand() == "newRow")
		{
			
		}
		else if(e.getActionCommand() == "rowDown")
		{
			
		}
		else if(e.getActionCommand() == "rowUp")
		{
			
		}
		else if(e.getActionCommand() == "help")
		{
			
		}
	}
}
