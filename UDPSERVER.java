/*

(b) Server Program :-

      This program displays the message in the
        Datagram Packets.
*/

import java.io.*;
import java.net.*;

class UDPServer {
 public static void main(String args[]) {
   try {
     DatagramSocket ds = new DatagramSocket(6000);
     byte buffer[]=new byte[1024];
     while(true)  {
       DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
       ds.receive(dp);
       String datarec = new String(dp.getData());
       System.out.println("data recieved  :" + datarec);
       if(datarec.equalsIgnoreCase("stop")) {
        System.out.println("Client Disconnected........");
        System.exit(0);
       }
     }
   }
   catch(Exception e) { e.printStackTrace(); }
 }
}

