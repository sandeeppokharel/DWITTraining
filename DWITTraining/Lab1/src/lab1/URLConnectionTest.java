/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.net.*;
import java.io.*;

class URLConnectionTest {
    public static void main(String[] args) throws Exception{
        URL ya = new URL("http://www.yahoo.com");
        URLConnection con =ya.openConnection();
        DataInputStream dis = new DataInputStream(con.getInputStream());
        String line;
            while((line=dis.readLine())!=null)
                System.out.println(line);
            dis.close();
    }}
