/*               COMMUNICATION USING TCP/IP SOCKET

Client Program:-

    This program sends a message to 
           the Server using TCP/IP Socket.
*/
import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient
{
 public static void  main(String args[])
 {
  if(args.length==1)
  {
   final int port=12000;
   String dd=args[0];
   
   try{
      Scanner sc = new Scanner(System.in);
	  Socket soc = new Socket(InetAddress.getByName(dd),port);
      BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
      PrintStream out = new PrintStream(soc.getOutputStream());
      String msg1 = in.readLine();
      System.out.println("Server message:"  + msg1);
      System.out.print("Enter message to Server :");     
      String msg2 = sc.next();
      out.println(msg2);
      out.flush();
      msg1 = in.readLine();
      System.out.println("Server message:" + msg1);
      soc.close();
     }
   catch(Exception e)     { e.printStackTrace(); }
  }
  else
   System.out.println("Syntax is : java program3 servername/IPaddress");
 }
}
