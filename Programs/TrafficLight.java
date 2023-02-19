import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrafficLight implements ActionListener{
 JFrame jf ;
 JButton red,gre,yel,clr;
 public TrafficLight(){
   jf = new JFrame("Traffic Light");
   jf.setLayout(null);
   jf.setVisible(true);
   jf.setSize(500,300);

   red= new JButton("Red");
   jf.add(red);
   red.setBounds(20,190,100,50);
   red.addActionListener(this);

   gre= new JButton("Green");
   jf.add(gre);
   gre.setBounds(140,190,100,50);
   gre.addActionListener(this); 
  
   yel= new JButton("Yellow");
   jf.add(yel);
   yel.setBounds(260,190,100,50);
   yel.addActionListener(this);
     
   clr= new JButton("Clear");
   jf.add(clr);
   clr.setBounds(380,190,100,50);
   clr.addActionListener(this);
 }
 public static void main(String args[]){
   new TrafficLight(); 
 }
 
 @Override
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==red){
   jf.getContentPane().setBackground(Color.RED);
  }
  else if(e.getSource()==gre){
   jf.getContentPane().setBackground(Color.green);
  }
  if(e.getSource()==yel){
   jf.getContentPane().setBackground(Color.yellow);
  }
  if(e.getSource()==clr){
   jf.getContentPane().setBackground(Color.white);
  }
 }
}
