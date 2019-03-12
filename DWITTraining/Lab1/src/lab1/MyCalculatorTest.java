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
   import javax.swing.*;
    public class MyCalculatorTest{
        public static void main (String []args){
            JFrame frm = new MyCalculator("calculator");
            frm.setSize(300,350);
           frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setVisible(true);
        }
    }
