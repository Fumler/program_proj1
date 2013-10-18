/**
 * 
 */
package no.whg.mini;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Class that handles the OptionPane for the different types in the right click context menu
 * Opens a dialog with textfields that the user can put in
 * TODO: Add error checking to see if values are actually numeric, function is already there, but not used yet
 * @author Fredrik
 *
 */
@SuppressWarnings("serial")
public class PropertiesHandler extends JOptionPane {
	private String[] labels = {
			Messages.getString("Table.rows"),
			Messages.getString("Table.columns"),
			Messages.getString("Table.height"),
			Messages.getString("Table.width"),
			Messages.getString("Options.JComboBox"),
			Messages.getString("Options.JSpinnerList"),
			Messages.getString("Options.JTextArea1"),
			Messages.getString("Options.JTextArea2"),
			Messages.getString("Options.JList1"),
			Messages.getString("Options.JList2")
	};

	/**
	 * Constructor of the PropertiesHandler class
	 * This class could probably have been a method, but for tidiness we put it as a class
	 * @param TableData data the data object you wish to edit values of
	 */
	public PropertiesHandler(TableData data) {
		super();
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
			JTextField columns = new JTextField();
			JTextField rows = new JTextField();
			JTextField width = new JTextField();
			JTextField height = new JTextField();
			JCheckBox scroll = new JCheckBox();
            JCheckBox wrap = new JCheckBox();
            
            final JComponent[] inputs = new JComponent[] {
                    new JLabel(labels[1]), columns,
                    new JLabel(labels[0]), rows,
                    new JLabel(labels[3]), width,
                    new JLabel(labels[2]), height,
                    new JLabel(labels[6]), scroll,
                    new JLabel(labels[7]), wrap
            };
 
            showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);
            
            data.setOptionsHeight(height.getText());
            data.setOptionsWidth(width.getText());
            data.setOptionsRows(rows.getText());
            data.setOptionsColumns(columns.getText());
            data.setOptionsScrollPane(scroll.isSelected());
            data.setOptionsWordWrapping(wrap.isSelected());
			
			
		} else if (data.getType() == "JList") {
			JTextField height = new JTextField();
			JTextField width = new JTextField();
			JCheckBox scroll = new JCheckBox();
			JCheckBox combo = new JCheckBox();
			
			final JComponent[] inputs = new JComponent[] {
					new JLabel(labels[2]), height,
					new JLabel(labels[3]), width,
					new JLabel(labels[8]), scroll,
					new JLabel(labels[9]), combo
			};
			
			showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);
			
			data.setOptionsHeight(height.getText());
			data.setOptionsWidth(width.getText());
			data.setOptionsScrollPane(scroll.isSelected());
			data.setOptionsComboBox(combo.isSelected());
			
		} else if (data.getType() == "JComboBox") {
			JTextField height = new JTextField();
			JTextField width = new JTextField();
			JCheckBox combo = new JCheckBox();
			
			final JComponent[] inputs = new JComponent[] {
					new JLabel(labels[2]), height,
					new JLabel(labels[3]), width,
					new JLabel(labels[4]), combo
			};
			
			showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);
			
			data.setOptionsHeight(height.getText());
			data.setOptionsWidth(width.getText());
			data.setOptionsComboBox(combo.isSelected());
		} else if (data.getType() == "JSpinnerList") {
			JTextField str = new JTextField();
			
			final JComponent[] inputs = new JComponent[] {
					new JLabel(labels[5]), str
			};
			
			showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);
			
			String[] tempStr = str.getText().trim().split(",");
			
			data.setOptionsSpinnerListArray(tempStr);
			
		} else if (data.getType() == "JSpinnerNumber") {
			JTextField startValue = new JTextField();
			JTextField minValue = new JTextField();
			JTextField maxValue = new JTextField();
			JTextField stepValue = new JTextField();
			
			final JComponent[] inputs = new JComponent[] {
					new JLabel("Start: "), startValue,
					new JLabel("Min: "), minValue,
					new JLabel("Max: "), maxValue,
					new JLabel("Step: "), stepValue
			};
			
			showMessageDialog(null, inputs, data.getType() + " dialog", JOptionPane.PLAIN_MESSAGE);
			
			data.setOptionsStartValue(Float.valueOf(startValue.getText()));
			data.setOptionsMinValue(Float.valueOf(minValue.getText()));
			data.setOptionsMaxValue(Float.valueOf(maxValue.getText()));
			data.setOptionsStepValue(Float.valueOf(stepValue.getText()));
			
		} else {
			
		}	
	}
	
	/**
	 * Method that checks if a string is a numeric value
	 * @param str given string
	 * @return true if given string is numeric
	 */
	@SuppressWarnings("unused")
	private boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}


}
