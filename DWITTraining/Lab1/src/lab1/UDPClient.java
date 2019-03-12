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
        
public class UDPClient {
    public static void main(String[] args) throws Exception
    {
        //create input stream
        BufferedReader inFromUSer = new BufferedReader(new InputStreamReader(System.in));
        
        //Create Client socket
        DatagramSocket clientSocket = new DatagramSocket();
        
        //Transalate hostname to IP address using DNS
        InetAddress IPAddress = InetAddress.getByName("localhost");
        
        byte[] sendData= new byte[1024];
        byte[] receiveData = new byte[1024];
        System.out.println("Enter a message:");
        
        String sentence = inFromUSer.readLine();
        sendData= sentence.getBytes();
       // System.out.println(sendData.toString());
        
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9878);
        clientSocket.send(sendPacket);
        
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String modifiedSentence = new String(receivePacket.getData());
        
        System.out.println("FROM SERVER:" + modifiedSentence);
        clientSocket.close();
        
        }
    }

