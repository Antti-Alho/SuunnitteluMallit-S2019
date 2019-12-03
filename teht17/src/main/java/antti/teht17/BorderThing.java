/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht17;

/**
 *
 * @author antti
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class BorderThing extends JFrame {
   public static void main(String[] args) {
      BorderThing test = new BorderThing();
      test.setBounds(20,20,250,150);
      test.show();
   }
   public BorderThing() {
      super("Border flyweights");
      JPanel panel   = new JPanel(), panel2 = new JPanel();
      Border border  = BorderFactory.createRaisedBevelBorder();
      Border border2 = BorderFactory.createRaisedBevelBorder();
      panel.setBorder(border);
      panel.setPreferredSize(new Dimension(200,142));
      panel2.setBorder(border2);
      panel2.setPreferredSize(new Dimension(150,270));
      Container contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());
      contentPane.add(panel);
      contentPane.add(panel2);
      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      addWindowListener(new WindowAdapter() {
         public void windowClosed(WindowEvent e) {
            System.exit(0);
         }
      });
      if(border == border2)
         System.out.println("bevel borders are shared");
      else
         System.out.println("bevel borders are NOT shared");
   }
}
