import java.applet.*;
import java.awt.*;

public class newapplet extends Applet
{
	String str;
	public void init(){
		str = "Applet Test JPLab";
			}
	public void paint(Graphics g)
{
		g.drawString(str, 50,50);
		 
	
	}
}
