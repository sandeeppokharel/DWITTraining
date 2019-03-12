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
public abstract class Person 
{
    private int ID;
    private String Name;
    private String Address;
    
    
}
    
abstract void print();
}

Person (int ID, String Name, String Address)
{
    this.ID=ID;
    this.Name=name;
    this.Address=address;
}

int getID()
{
    return(ID);
}
String getName()
{
    return(name);

}
String getAddress()
{
    return(address);
}

class Student extends Person