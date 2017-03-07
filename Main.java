import java.awt.*;

public class Main
{
	static double sheight;
	static double swidth;
	static double wscale;
	static double hscale;	

	public static void main(String[] args)
	{
		getReso();
		double prew = 1500 * wscale;
		double preh = 1125 * hscale;
		int width = (int) prew;
		int height = (int) preh;
		Window win = new Window();
		win.init(width, height);
	}

	static void getReso()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        swidth = screenSize.getWidth();
        sheight = screenSize.getHeight(); 
        if(swidth >= 2560)
        {
        	wscale = 1;
        }
        else if(swidth < 2560)
        {
        	wscale = swidth/2560;
        }
        if(sheight >= 1440)
        {
        	hscale = 1;
        }
        else if(sheight < 1440)
        {
        	hscale = sheight/1440;
        }
 
    }
}