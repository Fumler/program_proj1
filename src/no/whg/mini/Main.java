/**
 * 
 */
package no.whg.mini;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * The Main class, connects all the "dots" together to become a full program, that
 * 	lets the users create a GUI and save that to file
 * @author Fredrik, Peer
 *
 */
public class Main extends JFrame {
	private CustomTableModel tableModel = new CustomTableModel();
	private JTable table = new JTable(tableModel);
	private String[] objects = {"JLabel", "JButton", "JTextField", "JTextArea", 
			"JCheckBox", "JList", "JComboBox", "JSpinnerList", "JSpinnerNumber"
	};
	private JComboBox objectType = new JComboBox(objects);
	
	public Main() {	
		
		// override JFrame constructor
		super(Messages.getString("Main.title")); //$NON-NLS-1$
		// tell application to close on exit, instead of hide on exit
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// set the default size
		setSize(400, 400);
		// set the initial position of window to center
		setLocationRelativeTo(null);
		// show the frame
		setVisible(true);
		
		// set the look and feel of the program to resemble users OS, if possible
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println(Messages.getString("Main.catchError") + e); //$NON-NLS-1$
		}
		
		
		
		// add the menu bar at the top
		setJMenuBar(new Menubar());
		
		// add the toolbar below the menu bar
		add(new Toolbar(tableModel), BorderLayout.NORTH);
		
		
		tableModel.setTableFrame(this);
		add(new JScrollPane(table), BorderLayout.CENTER);
		table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(objectType));
		
		
		// pack it all together
		pack();
	}

	/**
	 * @param args The variables that are sent with the "java" command
	 */
	public static void main(String[] args) {
		// set the locale
		//Messages.setLocale(args[0], args[1]);
		new Main();
		
	}

}
