import java.awt.*;
import java.applet.*;

/*<Applet code=AppletHorizontal width=260 height=260></applet>*/

public class AppletHorizontal extends Applet
{
	Color c[]={Color.black,Color.blue,Color.cyan,Color.darkGray,Color.gray,Color.green,Color.lightGray,Color.magenta,Color.orange,Color.pink,Color.red,Color.white,Color.yellow};
	int deltay=260/c.length;
	public void paint(Graphics g)
	{
		for(int i=0;i<c.length;i++)
		{
			g.setColor(c[i]);
			g.fillRect(0,i*deltay,260,20);
		}
	}
	
}