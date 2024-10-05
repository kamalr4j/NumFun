import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AnimTitle implements ActionListener
{
    JLabel title=new JLabel();
    byte atitle,a,b;
    public AnimTitle(JLabel title)
    {
        this.title=title;
    }
    public void actionPerformed(ActionEvent e)
    {
        atitle=(byte)((Math.random()*11)+1);
        if(atitle==1)
            title.setForeground(Color.blue);
        else if(atitle==2)
            title.setForeground(Color.cyan);
        else if(atitle==3)
            title.setForeground(Color.gray);
        else if(atitle==4)
            title.setForeground(Color.green);
        else if(atitle==5)
            title.setForeground(Color.yellow);
        else if(atitle==6)
            title.setForeground(Color.lightGray);
        else if(atitle==7)
            title.setForeground(Color.magenta);
        else if(atitle==8)
            title.setForeground(Color.orange);
        else if(atitle==9)
            title.setForeground(Color.pink);
        else if(atitle==10)
            title.setForeground(Color.red);
        else
            title.setForeground(Color.white);
    }
}    