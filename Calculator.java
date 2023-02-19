import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton clearButton;
    JButton dotButton, additionButton, equalsButton, divisionButton, multiplicationButton, subtractionButton;
    String oldValue;
    int temp;
    float result;

    //----------------------------------------------------------------------//
 
     Calculator(){
        jf= new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(650, 600);
        jf.setLocation(325, 50);
        Color color=new Color(0,0,0);
        jf.getContentPane().setBackground(color);


         
        displayLabel = new JLabel();
        displayLabel.setBounds(30,30, 400,70);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        Color colour=new Color(255, 255, 255);
        displayLabel.setBackground(colour);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(displayLabel);

        //adding buttons
        sevenButton= new JButton("7");
        sevenButton.setBounds(30,130, 80,80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40)); 
        sevenButton.setBackground(colour);       
        jf.add(sevenButton);

        eightButton= new JButton("8");
        eightButton.setBounds(130,130, 80,80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.setBackground(colour);       
        jf.add(eightButton);

        nineButton= new JButton("9");
        nineButton.setBounds(230,130, 80,80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.setBackground(colour); 
        jf.add(nineButton);

        fourButton= new JButton("4");
        fourButton.setBounds(30,230, 80,80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.setBackground(colour); 
        jf.add(fourButton);

        fiveButton= new JButton("5");
        fiveButton.setBounds(130,230, 80,80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.setBackground(colour); 
        jf.add(fiveButton);

        sixButton= new JButton("6");
        sixButton.setBounds(230,230, 80,80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.setBackground(colour); 
        jf.add(sixButton);

        oneButton= new JButton("1");
        oneButton.setBounds(30,330, 80,80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.setBackground(colour); 
        jf.add(oneButton);

        twoButton= new JButton("2");
        twoButton.setBounds(130,330, 80,80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.setBackground(colour); 
        jf.add(twoButton);

        threeButton= new JButton("3");
        threeButton.setBounds(230,330, 80,80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.setBackground(colour); 
        jf.add(threeButton);

        dotButton= new JButton(".");
        dotButton.setBounds(30,430, 80,80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.setBackground(colour); 
        jf.add(dotButton);

        zeroButton= new JButton("0");
        zeroButton.setBounds(130,430, 80,80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.setBackground(colour); 
        jf.add(zeroButton);

        equalsButton= new JButton("=");
        equalsButton.setBounds(230,430, 80,80);
        equalsButton.addActionListener(this);
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalsButton.setBackground(colour); 
        jf.add(equalsButton);

        divisionButton= new JButton("/");
        divisionButton.setBounds(350,130, 80,80);
        divisionButton.addActionListener(this);
        divisionButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divisionButton.setBackground(colour); 
        jf.add(divisionButton);

        multiplicationButton= new JButton("*");
        multiplicationButton.setBounds(350,230, 80,80);
        multiplicationButton.addActionListener(this);
        multiplicationButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multiplicationButton.setBackground(colour); 
        jf.add(multiplicationButton);

        subtractionButton= new JButton("-");
        subtractionButton.setBounds(350,330, 80,80);
        subtractionButton.addActionListener(this);
        subtractionButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subtractionButton.setBackground(colour); 
        jf.add(subtractionButton);

        additionButton= new JButton("+");
        additionButton.setBounds(350,430, 80,80);
        additionButton.addActionListener(this);
        additionButton.setFont(new Font("Arial", Font.PLAIN, 40));
        additionButton.setBackground(colour); 
        jf.add(additionButton);

        clearButton= new JButton("Clear");
        clearButton.setBounds(480,430, 110,80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.setBackground(colour); 
        jf.add(clearButton);

        //-----------------------------------------------------------//
         
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
    //----------------------------------------------------------------------//


    public static void main(String[] args){
        new Calculator();
    }

    //----------------------------------------------------------------------//
    @Override
    public void actionPerformed(ActionEvent e){
        // displayLabel.setText("7");
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"7");
            }
        }   

        else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"8");
            }
        }    
        else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"9");
            }
        }    

        else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"4");
            }
        }    

        else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"5");
            }
        }  

        else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"6");
            }
        }

        else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"1");
            }
        }    

        else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"2");
            }
        }    

        else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"3");
            }
        }    

        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"0");
            }
        }    

        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked = false;
            }else{
            displayLabel.setText(displayLabel.getText()+"0");
            }
        }    

        else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }    

        else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }    
        
        else if(e.getSource()==additionButton){
            temp = 1;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
        
        else if(e.getSource()==multiplicationButton){
            temp = 2;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
        
        else if(e.getSource()==subtractionButton){
            temp = 3;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }

        else if(e.getSource()==divisionButton){
            temp = 4;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
        }
        
        //----------------------------------------------------------------------//

        else if(e.getSource()==equalsButton){
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