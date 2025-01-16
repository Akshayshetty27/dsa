import javax.swing.*;
import java.awt.*;
// import java.util.JPanel;

// import java.swing.JFrame;
class Myframe

{

    public static void centerframe(JFrame frame)
    {
        Toolkit tool=Toolkit.getDefaultToolkit();
        Dimension screensize= tool.getScreenSize();
        int screenheight= screensize.height;
        int screenwith = screensize.width;
        System.out.println(screenwith);
        int framewidth= frame.getHeight();
        int frameheight= frame.getWidth();
        int x= (screenheight)/2;
        int y= (screenwith) /4;
        frame.setLocation(250,100);
            }
    public static void main(String args[])
    {
    


        JFrame frame1= new JFrame("MY FRAME 2 ");
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension screen= tool.getScreenSize();
        int x= screen.height;
        int y= screen.width;
        frame1.setSize(x,y);
        // frame1.setSize(1000,500);
        frame1.setVisible(true);
        frame1.setLocation(0,0);

        // centerframe(frame1);
        // frame1.setLocation(100,100);
        // JPanel panel= new JPanel();
        // panel.setLayout();

    }
}