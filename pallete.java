/*
  TEAM 1
  LAB EX 13
 */
package lab.ex.pkg13;

//importing packages

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;

//main class
//using AdjustmentListener for the ScrollBar to work
class pallete implements AdjustmentListener  
{ 
    JFrame f;//FRAME
    JScrollBar s,s1,s2;
    
pallete()//Constructor
{  
f= new JFrame("Scrollbar Example");
//Initial values are set to 128--->as mentioned in the question
s=new JScrollBar(JScrollBar.VERTICAL, 128, 225, 0, 255);  //scroll bar 1
s1=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255); //scroll bar 2
s2=new JScrollBar(JScrollBar.VERTICAL, 128, 225, 0, 255); //scroll bar 3
s.setBounds(100,100, 30,100);  
s1.setBounds(140,100, 30,100);
s2.setBounds(180,100, 30,100);
s.addAdjustmentListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
//adding ScrollBars to Frame
f.add(s);  
f.add(s1); 
f.add(s2); 
f.setSize(500,500);  
f.setLayout(null);  
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closing the JFrame
}  
public void adjustmentValueChanged(AdjustmentEvent ae)
{
    //Slider Objects
    int red= s.getValue();
    int green = s1.getValue();
    int blue =s2.getValue();
    System.out.println(red);
    f.getContentPane().setBackground(new Color(red,green,blue));
}
public static void main(String args[])  
{  
new pallete();  
}
}  
