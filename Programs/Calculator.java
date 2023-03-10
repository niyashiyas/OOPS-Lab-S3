import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.lang.String;

public class Calculator implements ActionListener{
 boolean isOperatorClicked=false;
 String oldValue;
 int temp;
 float result;
 JFrame jf;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,bc,be,bdiv;
 JLabel displayLabel;
 Calculator(){
  jf = new JFrame("Calculator");
  jf.setLayout(null);
  jf.setSize(600,750);
  jf.setVisible(true);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  displayLabel = new JLabel();
  displayLabel.setBackground(Color.white);
  displayLabel.setBounds(10,10,460,80);
  Color color=new Color(0,0,0);
  Color colour=new Color(255, 255, 255);
  jf.getContentPane().setBackground(color);
  displayLabel.setOpaque(true);
  jf.add(displayLabel);

   //adding buttons
        b7= new JButton("7");
        b7.setBounds(30,130, 80,80);
        b7.addActionListener(this);
        b7.setBackground(colour);       
        jf.add(b7);

        b8= new JButton("8");
        b8.setBounds(130,130, 80,80);
        b8.addActionListener(this);
        b8.setBackground(colour);       
        jf.add(b8);

        b9= new JButton("9");
        b9.setBounds(230,130, 80,80);
        b9.addActionListener(this);
        b9.setBackground(colour); 
        jf.add(b9);

        b4= new JButton("4");
        b4.setBounds(30,230, 80,80);
        b4.addActionListener(this);
        b4.setBackground(colour); 
        jf.add(b4);

        b5= new JButton("5");
        b5.setBounds(130,230, 80,80);
        b5.addActionListener(this);
        b5.setBackground(colour); 
        jf.add(b5);

        b6= new JButton("6");
        b6.setBounds(230,230, 80,80);
        b6.addActionListener(this);
        b6.setBackground(colour); 
        jf.add(b6);

        b1= new JButton("1");
        b1.setBounds(30,330, 80,80);
        b1.addActionListener(this);
        b1.setBackground(colour); 
        jf.add(b1);

        b2= new JButton("2");
        b2.setBounds(130,330, 80,80);
        b2.addActionListener(this);
        b2.setBackground(colour); 
        jf.add(b2);

        b3= new JButton("3");
        b3.setBounds(230,330, 80,80);
        b3.addActionListener(this);
        b3.setBackground(colour); 
        jf.add(b3);

        bd= new JButton(".");
        bd.setBounds(30,430, 80,80);
        bd.addActionListener(this);
        bd.setBackground(colour); 
        jf.add(bd);

        b0= new JButton("0");
        b0.setBounds(130,430, 80,80);
        b0.addActionListener(this);
        b0.setBackground(colour); 
        jf.add(b0);

        be= new JButton("=");
        be.setBounds(230,430, 80,80);
        be.addActionListener(this);
        be.setBackground(colour); 
        jf.add(be);

        bdiv= new JButton("/");
        bdiv.setBounds(350,130, 80,80);
        bdiv.addActionListener(this);
        bdiv.setBackground(colour); 
        jf.add(bdiv);

        bm= new JButton("*");
        bm.setBounds(350,230, 80,80);
        bm.addActionListener(this);
        bm.setBackground(colour); 
        jf.add(bm);

        bs= new JButton("-");
        bs.setBounds(350,330, 80,80);
        bs.addActionListener(this);
        bs.setBackground(colour); 
        jf.add(bs);

        ba= new JButton("+");
        ba.setBounds(350,430, 80,80);
        ba.addActionListener(this);
        ba.setBackground(colour); 
        jf.add(ba);

        bc= new JButton("Clear");
        bc.setBounds(480,430, 110,80);
        bc.addActionListener(this);
        bc.setBackground(colour); 
        jf.add(bc);


 }
 public static void main(String args[]){
  new Calculator();
 }
 @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b7){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"7");
            }
        }   

        else if(e.getSource()==b8){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"8");
            }
        }    
        else if(e.getSource()==b9){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"9");
            }
        }    

        else if(e.getSource()==b4){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"4");
            }
        }    

        else if(e.getSource()==b5){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"5");
            }
        }  

        else if(e.getSource()==b6){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"6");
            }
        }

        else if(e.getSource()==b1){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"1");
            }
        }    

        else if(e.getSource()==b2){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"2");
            }
        }    

        else if(e.getSource()==b3){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"3");
            }
        }    

        else if(e.getSource()==b0){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"0");
            }
        }    

        else if(e.getSource()==b0){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"0");
            }
        }    

        else if(e.getSource()==bc){
            displayLabel.setText("");
        }    

        else if(e.getSource()==bd){
            displayLabel.setText(displayLabel.getText()+".");
        }    
        
        else if(e.getSource()==ba){
            temp = 1;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
        
        else if(e.getSource()==bm){
            temp = 2;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
        
        else if(e.getSource()==bs){
            temp = 3;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }

        else if(e.getSource()==bdiv){
            temp = 4;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
	else if(e.getSource()==be){
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            if(temp==1){
            result = oldValueF + newValueF;
            }
            else if(temp==2){
            result = oldValueF * newValueF;
            }
            else if(temp==3){
            result = oldValueF - newValueF;
            }
            else if(temp==4){
            result = oldValueF / newValueF;
            }
            
            displayLabel.setText(result +"");

        }

  
 }
}
 