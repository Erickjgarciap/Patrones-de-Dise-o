/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

/**
 *
 * @author Ericko
 */
import javax.swing.*;
import java.awt.*;

public class ListcheckBoxCellRenderer extends JCheckBox implements ListCellRenderer {
    //private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);

    public ListcheckBoxCellRenderer( ) {
        setOpaque(true);
       // setIconTextGap(12);
    }

 
    
    public Component getListCellRendererComponent(
        JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus)
    {
        BookEntry entry = (BookEntry)value;
        this.setText(entry.getTitle( ));
        //setText(entry.getTitle( ));
    //   setIcon(entry.getImage( ));
       
        if(isSelected) {
            this.setSelected(true);
            //setBackground(HIGHLIGHT_COLOR);
            //setForeground(Color.white);
        } else {
              this.setSelected(false);
           // setBackground(Color.white);
            //setForeground(Color.black);
        }
        return this;   
   }
}
