import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.lang.String;

public class Calculator implements ActionListener{
 String b = "";
 int res= 0;
 JFrame jf;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,bc,be;
 JLabel displayLabel;
 Calculator(){
  jf = new JFrame("Calculator");
  jf.setLayout(null);
  jf.setSize(500,500);
  //jf.setPosition(20,80);
  displayLabel = new JLabel();
  displayLabel.setBackground(Color.white);
  displayLabel.setBounds(10,10,390,100);
  //displayLabel.setHorizontalAllignment(SwingConstants.RIGHT);

  b1 = new JButton("1");
  b1.setBounds(20,111,50,171);
  jf.add(b1);
  b1.addActionListener(this);

  displayLabel.setOpaque(true);
  jf.add(displayLabel);
  jf.setVisible(true);
 }
 public static void main(String args[]){
  new Calculator();
 }
 @Override
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
   displayLabel.setText("1");
  }
 }
}
 