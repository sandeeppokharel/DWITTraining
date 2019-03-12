import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        Scanner key = new Scanner(System.in);
        Socket soc= new Socket("localhost", 1234);
        Scanner s= new Scanner(soc.getInputStream());
        PrintStream ps= new PrintStream(soc.getOutputStream());
        System.out.println("Enter a text");
        String str= key.nextLine();
        ps.println(str);
        String str1= s.nextLine();
        System.out.println("Received Message:" + str1);
     
    }
}