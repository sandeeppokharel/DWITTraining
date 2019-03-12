/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.net.*;
import java.io.*;

public class URLDemo {
    public static void main(String[] args)
    {
        try{
            URL url = new URL("http://www.google.com/download");
            System.out.println("protocol:"+url.getProtocol());
            System.out.println("HostName:"+url.getHost());
            System.out.println("Port Number:"+url.getPort());
            System.out.println("File Name:"+url.getFile());
    }
            catch(Exception e)
            {
                System.out.println(e);
                        
            }
    
}
}