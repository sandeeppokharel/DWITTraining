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
import java.net.*;
import java.io.*;
import java.util.*;

public class TCPServer {
    public static void main(String[] args) throws Exception
    
    {
        
        ServerSocket ser = new ServerSocket(1234);
        Socket s;
            while(true)
            {
                System.out.println("server is waitinggggg");
                s=ser.accept();
        Scanner scan = new Scanner(s.getInputStream());
        PrintStream ps = new PrintStream(s.getOutputStream());
        String message = scan.nextLine();
        System.out.println("received from client"+message);
        String str= message.toUpperCase();
        ps.println(str);
         }
      
                  
            
    }
}
