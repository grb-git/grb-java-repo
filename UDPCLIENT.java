/*                  COMMUNICATION USING DATAGRAM SOCKET

Program    : DATAGRAM SOCKET                            
                     
Client Program:-

  	 This program implements Datagram Packets and 
   	 Datagram Sockets and sends a message to Server.
*/

import java.io.*;
import java.net.*;
import java.util.*;

class UDPClient  {
 public static void main(String args[])  {
  if(args.length==1) {
    try {
     DatagramSocket ds=new DatagramSocket(7000);
     Scanner sc = new Scanner(System.in);
     String data="",msg="";
     String dd=args[0];
     do {
      msg="";
      System.out.println("Enter data to send- Type stop to Stop");
      msg=sc.next();
      byte  datatosend[]=msg.getBytes();
      ds.send(new DatagramPacket(datatosend,datatosend.length,
             InetAddress.getByName(dd),6000));
     }while(!msg.equals("stop"));
    } 
    catch(Exception e) { e.printStackTrace(); }
    System.out.println("Data has been  Sended Succesfully");
  }
  else
    System.out.println("Syntax is : java program5 servername/IPaddress");
 }
}
