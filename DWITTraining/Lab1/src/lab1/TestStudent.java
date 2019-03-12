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
public class TestStudent 
{
    public static void main(String[]args)
    {
        student S1=new student();
        
        S1.setName("sandeep");
        S1.setAddress("sinamangal");
        S1.setRoll(11);
        
        System.out.println("the outputs are ");
        System.out.println("Name"+S1.getName());
        System.out.println("Address"+S1.getAddress());
        System.out.println("Roll"+S1.getRoll());
    }   
    }
            
    

