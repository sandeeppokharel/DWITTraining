/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp laptop
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        Scanner key = new Scanner(System.in);
        Socket soc  = new Socket("localhost",1234);
        Scanner s = new Scanner (soc.getInputStream());
        PrintStream ps = new PrintStream (soc.getOutputStream());
        System.out.println("enter a text");
            String str = key.nextLine();
            ps.println(str); //writing to socket
            String str1 = s.nextLine();
            System.out.println("received message="+str1);
            soc.close();
    }
}


