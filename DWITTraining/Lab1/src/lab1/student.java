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
public class student {
        private int roll;
        public  String name;
        private String address;
        
    void setRoll(int roll)
    {
        this.roll=roll;
       
    }

    void setAddress (String address)
    {
        this.address=address;
        
    }
    void setName (String name)
    {
        this.name=name;
       
        
    }
    int getRoll()
    {
        return(roll);
    }
    String getAddress ()
    {
        return(address);
    }
    String getName()
    {
        return(name);
        
    }
    }
    