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
public class CallTest {
    public static void main (String[] args){
        
    
            postpaidGSM pg = new postpaidGSM();
            postpaidCDMA pc = new postpaidCDMA();
            System.out.println("the cost of GSM is"+ pg.pay(5));
            System.out.println("the cost of CDMA is "+ pc.pay(5));
    }
    
            
    
}
