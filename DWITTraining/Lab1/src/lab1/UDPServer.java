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
import java.io.*;
import java.net.*;
public class UDPServer {
    public static void main(String[] args) throws Exception
    {
        //Create datagram socket on port 9876
        DatagramSocket serverSocket = new DatagramSocket(9876);
        
        byte[] sendData= new byte[1024];
        byte[] receiveData = new byte[1024];
        
        while(true)
        {
            //create space for the recieved datagram
            System.out.println("Server running.....");
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            
            //receive the datagram
            serverSocket.receive(receivePacket);
                        
            String sentence = new String(receivePacket.getData().toString());
            System.out.println(sentence);
            
            //getIP address and port number of sender
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalizedSentence = sentence.toUpperCase();
            sendData=capitalizedSentence.getBytes();
            
            //create datagram to send to client
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            
            //write put the datagram to the socket
            serverSocket.send(sendPacket);
            
                        
        } //end while loop
    }
    
}
