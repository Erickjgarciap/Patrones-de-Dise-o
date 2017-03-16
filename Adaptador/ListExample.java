
package adaptador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.*;

public class ListExample extends JPanel {

       private BookEntry books[] = {
             new BookEntry("Ant: The Definitive Guide","C:/Users/Ericko/Desktop/gif/1.png"),
           new BookEntry("Database Programming with JDBC and Java", 
                         "C:/Users/Ericko/Desktop/gif/2.png"),
           new BookEntry("Developing Java Beans", "C:/Users/Ericko/Desktop/gif/3.png"),
           new BookEntry("Developing JSP Custom Tag Libraries", "C:/Users/Ericko/Desktop/gif/4.png"),
           new BookEntry("Java 2D Graphics", "C:/Users/Ericko/Desktop/gif/4.png"),
           new BookEntry("Java and XML","C:/Users/Ericko/Desktop/gif/5.png"),
           new BookEntry("Java and XSLT","C:/Users/Ericko/Desktop/gif/6.png"),
           new BookEntry("Java and SOAP", "C:/Users/Ericko/Desktop/gif/7.png"),
           new BookEntry("Java and XML Data Binding", "C:/Users/Ericko/Desktop/gif/8.png"),
           new BookEntry("Java Cookbook",  "C:/Users/Ericko/Desktop/gif/9.png"),
           new BookEntry("Java Cryptography", "C:/Users/Ericko/Desktop/gif/10.png"),
           new BookEntry("Java Distributed Computing",  "C:/Users/Ericko/Desktop/gif/1.png"),
           new BookEntry("Java I/O",  "C:/Users/Ericko/Desktop/gif/2.png"),
           new BookEntry("Java in a Nutshell",  "C:/Users/Ericko/Desktop/gif/3.png"),
           new BookEntry("Java Management Extensions",  "C:/Users/Ericko/Desktop/gif/4.png"),
           new BookEntry("Java Message Service",  "C:/Users/Ericko/Desktop/gif/5.png"),
           new BookEntry("Java Network Programming",  "C:/Users/Ericko/Desktop/gif/6.png"),
           new BookEntry("Java Performance Tuning",  "C:/Users/Ericko/Desktop/gif/7.png"),
           new BookEntry("Java RMI",  "C:/Users/Ericko/Desktop/gif/8.png"),
           new BookEntry("Java Security",  "C:/Users/Ericko/Desktop/gif/9.png"),
           new BookEntry("JavaServer Pages",  "C:/Users/Ericko/Desktop/gif/10.png"),
           new BookEntry("Java Servlet Programming",  "C:/Users/Ericko/Desktop/gif/1.png"),
           new BookEntry("Java Swing",  "C:/Users/Ericko/Desktop/gif/2.png"),
           new BookEntry("Java Threads", "C:/Users/Ericko/Desktop/gif/3.png"),
           new BookEntry("Java Web Services",  "C:/Users/Ericko/Desktop/gif/4.png"),
           new BookEntry("Learning Java", "C:/Users/Ericko/Desktop/gif/5.png")
       };

    private JList booklist = new JList(books);

    public ListExample( ) {
        setLayout(new BorderLayout( ));
        JButton button = new JButton("Print");
        button.addActionListener(new PrintListener( ));

        booklist = new JList(books);
        booklist.setCellRenderer(new BookCellRenderer( ));   
      // booklist.setCellRenderer(new ListcheckBoxCellRenderer( ));
        booklist.setVisibleRowCount(4);
        JScrollPane pane = new JScrollPane(booklist);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Example");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new ListExample( ));
         frame.pack( );
         frame.setVisible(true);
    }
  // An inner class to respond to clicks of the Print button
    class PrintListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selected[] = booklist.getSelectedIndices( );
            System.out.println("Selected Elements:  ");

            for (int i=0; i < selected.length; i++) {
                BookEntry element =
                  (BookEntry)booklist.getModel( ).getElementAt(selected[i]);
                System.out.println("  " + element.getTitle( ));
            }
        }
    }
}
