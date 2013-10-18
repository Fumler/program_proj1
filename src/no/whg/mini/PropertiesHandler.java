/**
 * 
 */
package no.whg.mini;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Class that handles the OptionPane for the different types in the right click context menu
 * @author Fredrik
 *
 */
public class PropertiesHandler extends JOptionPane {
	private String type;
	private int kolloenner;
	private int width;
	private int height;
	private int columns;
	private JCheckBox cb1 = new JCheckBox();
	private JCheckBox cb2 = new JCheckBox();
	private String s;
	private TableData data;
	
	final JFrame parent = new JFrame();
	
	private String[] labels = {
			Messages.getString("Table.rows"),
			Messages.getString("Table.columns"),
			Messages.getString("Table.height"),
			Messages.getString("Table.width"),
			Messages.getString("Options.JComboBox"),
			Messages.getString("Options.JSpinnerList"),
			Messages.getString("Options.JTextArea1"),
			Messages.getString("Options.JTextArea2"),
			Messages.getString("Options.JList1")
	};

	/**
	 * @param type
	 */
	public PropertiesHandler(TableData data) {
		super();
		this.data = data;
	
		if (data.getType() == "JTextField") {
			JTextField rows = new JTextField();
			JTextField width = new JTextField();
			JTextField height = new JTextField();

			final JComponent[] inputs = new JComponent[] {
                    new JLabel(labels[0]), rows,
                    new JLabel(labels[3]), width,
                    new JLabel(labels[2]), height
            };
 
            showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);

			data.setOptionsHeight(height.getText());
			data.setOptionsWidth(width.getText());
			data.setOptionsRows(height.getText());
		} else if (data.getType() == "JTextArea") {
			
		} else if (data.getType() == "JList") {
			
		} else if (data.getType() == "JComboBox") {
			
		} else if (data.getType() == "JSpinnerList") {
			
		} else if (data.getType() == "JSpinnerNumber") {
			
		} else {
			
		}	
	}
	
	private boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}


}
