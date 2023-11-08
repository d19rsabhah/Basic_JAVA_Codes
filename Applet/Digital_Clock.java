import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code = "Digital_Cock" width = "800" height = "800">
</applet>*/
public class Digital_Clock extends Applet implements Runnable{
	Thread t, t1;
	public void start()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		t1 = Thread.currentThread();
		while(t1 == t)
		{
			repaint();
			try
			{
				t1.sleep(1000);
			}
			catch(InterruptedException IE)
			{}
		}
	}
	public void paint(Graphics G1)
	{
	    Calendar cal = new GregorianCalendar();
		String hour = String.valueOf(cal.get(Calendar.HOUR));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		G1.drawString(hour + " : " + minute + " : " + second, 20, 30);
	}
}
