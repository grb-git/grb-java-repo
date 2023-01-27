import java.awt.*;
import javax.swing.*;
/*
  <applet code="MovingBanner" width="400" height="300">
  </applet>
 */
public class MovingBanner extends JApplet implements Runnable {
    Thread t = null;
    boolean state = true;
    String msg = "RVR & JC College of Engineering. ";
    JLabel lbl;
    public void init(){
        lbl = new JLabel(msg);
        add(lbl);
    }

    public void start(){
        t = new Thread(this);
        t.start();
       state = true;
    }

    public void stop(){
        state = false;
        t=null;
    }

    public void run(){
        while(state){
            char c = msg.charAt(0);
            msg = msg.substring(1,msg.length());
            msg += c;
            lbl.setText(msg);
           
            try{
            Thread.sleep(200);
            }catch(InterruptedException ie){

            }
        }
    }
}
