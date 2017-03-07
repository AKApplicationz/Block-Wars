import java.awt.*;

public class Main
{
	double sheight;
	double swidth;
	static double wscale;
	static double hscale;	

	public static void main(String[] args)
	{
		Window win = new Window();
		win.init(1500 * wscale , 1125 * hscale);
	}

	void getReso()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        swidth = screenSize.getWidth();
        sheight = screenSize.getHeight(); 
        wscale = swidth / 2560; 
        hscale = sheight / 1440;     
    }
}