/*PROGRAM:-   TCP SERVER PROGRAM

(b) Server Program:-

   This program receives message from client and 
              acknowledge the same
*/
import java.net.*;
import java.io.*;

public class TCPServer
{
  public static void main(String args[])
  {
    int port=12000;
    
    try
    {
        ServerSocket ssoc = new ServerSocket(port);
        Socket soc = ssoc.accept();
        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        PrintStream out=new PrintStream(soc.getOutputStream());
        String msg2="Server received client request";
        out.println(msg2);
        out.flush();
        String msg1 = in.readLine();      // server receives message from client 
        System.out.println("Message from client :"+msg1);
        out.println(msg1 + " : Received by server");
        out.flush();
        ssoc.close();
        soc.close();
    }
    catch(IOException ie)    {   System.out.println(ie);    }
 }
}

