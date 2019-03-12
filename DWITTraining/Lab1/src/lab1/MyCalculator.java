/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author hp laptop
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyCalculator extends JFrame {
    private JTextField txt1,txt2,txt3;
    private JButton btnAdd,btnSub;
    MyCalculator (String title){
        super(title);
        
       setLayout (new GridLayout(4,2));
       JLabel lbl1 = new JLabel("Number 1");
       JLabel lbl2 = new JLabel("Number 2");
       JLabel lbl3 = new JLabel("RESULT");
        txt1 = new JTextField(40);
        txt2 = new JTextField(40);
        txt3 = new JTextField(40);
       btnAdd= new JButton("+");
       btnSub= new JButton("-");
       
       //Adding Componenets in Container 
            add(lbl1);
            add(txt1);
            add(lbl2);
            add(txt2);
            add(lbl3);
            add(txt3);
            add(btnAdd);
            add(btnSub);
            
       //Event Registration
       
        ButtonEvent be = new ButtonEvent();
        btnAdd.addActionListener(be);
        btnSub.addActionListener(be);
        
   
    }
    
    
    //Defining Inner Class
    private class ButtonEvent implements ActionListener{
        
    public void actionPerformed (ActionEvent event)
    {
        Object Source = event.getSource();
        int num1,num2;
        int result=0;
       num1=Integer.parseInt(txt1.getText());
       num2=Integer.parseInt(txt2.getText());
      if (Source == btnAdd)
          result= num1+num2;
      if (Source == btnSub)
          result= num1-num2;
      txt3.setText(String.valueOf(result));
      
    }
    }
}

