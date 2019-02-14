package kilango;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
   private JFrame frame = new JFrame();
   private JPanel panel = new JPanel(null);
   private JLabel label = new JLabel("Enter Radius number");
   private JLabel label2 = new JLabel("Area is");
   private JTextField textField = new JTextField();
   private JButton button = new JButton("Compute");
   private JTextArea textArea = new JTextArea();
   Circle circle = new Circle();


   public Gui(){
   kilango();

   }

   public void kilango(){
       frame.setTitle("Get Area");
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setSize(500,300);
       frame.setVisible(true);
       panel.setBackground(Color.GRAY);
       label.setBounds(100,100,150,20);
       panel.add(label);
       textField.setBounds(240,100,120,20);
       panel.add(textField);
       button.setBounds(240,140,100,20);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               double n = Double.parseDouble(textField.getText());
               circle.setRadius(n);
               textArea.setText(circle.toString());
           }
       });
       panel.add(button);
       label2.setBounds(125,180,150,20);
       textArea.setBounds(170,180,285,60);
       textArea.setEditable(false);
       panel.add(label2);
       panel.add(textArea);
       frame.add(panel);



   }
}
