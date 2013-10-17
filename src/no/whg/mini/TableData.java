/**
 * 
 */
package no.whg.mini;

import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Class that holds the data of each object (or list item) in the table
 * @author Fredrik
 *
 */
public class TableData implements Serializable{
    private static final long serialVersionUID = 1L;
    private String type;
    private String varName;
    private String text;
    private String row;
    private String column;
    private String rows;
    private String columns;
    private String fill;
    private String anchor;
    
    public TableData() {
        type = "JButton";
        varName = "var";
        text = "text";
        row = "1";
        column = "1";
        rows = "1";
        columns = "1";
        fill = "1";
        anchor = "";
    }
    
    /**
     * @param varName
     */
    public TableData(String varName) {
    	type = "JPanel";
        this.varName = varName;
        text = "text";
        row = "1";
        column = "1";
        rows = "1";
        columns = "1";
        fill = "1";
        anchor = "";
    }
    /**
     * @param type
     * @param varName
     * @param text
     * @param row
     * @param column
     * @param rows
     * @param columns
     * @param fill
     * @param anchor
     */
    public TableData(String type, String varName, String text, String row,
            String column, String rows, String columns, String fill, String anchor) {
        super();
        this.type = type;
        this.varName = varName;
        this.text = text;
        this.row = row;
        this.column = column;
        this.rows = rows;
        this.columns = columns;
        this.fill = fill;
        this.anchor = anchor;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the varName
     */
    public String getVarName() {
        return varName;
    }
    /**
     * @param varName the varName to set
     */
    public void setVarName(String varName) {
        this.varName = varName;
        
    }
    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * @return the row
     */
    public String getRow() {
        return row;
    }
    /**
     * @param row the row to set
     */
    public void setRow(String row) {
        this.row = row;
    }
    /**
     * @return the column
     */
    public String getColumn() {
        return column;
    }
    /**
     * @param column the column to set
     */
    public void setColumn(String column) {
        this.column = column;
    }
    /**
     * @return the rows
     */
    public String getRows() {
        return rows;
    }
    /**
     * @param rows the rows to set
     */
    public void setRows(String rows) {
        this.rows = rows;
    }
    /**
     * @return the columns
     */
    public String getColumns() {
        return columns;
    }
    /**
     * @param columns the columns to set
     */
    public void setColumns(String columns) {
        this.columns = columns;
    }
    /**
     * @return the fill
     */
    public String getFill() {
        return fill;
    }
    /**
     * @param fill the fill to set
     */
    public void setFill(String fill) {
        this.fill = fill;
    }
    /**
     * @return the anchor
     */
    public String getAnchor() {
        return anchor;
    }
    /**
     * @param anchor the anchor to set
     */
    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

}
