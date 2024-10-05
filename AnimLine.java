import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AnimLine implements ActionListener
{
    JLabel lineU=new JLabel();
    JLabel lineD=new JLabel();
    short xu=1,xd=590;
    byte a,b;
    public AnimLine(JLabel lineU,JLabel lineD)
    {
        this.lineU=lineU;
        this.lineD=lineD;
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(xu==580)
        a=1;
        else if(xu==1)
        a=0;
        if(xd==590)
        b=1;
        else if(xd==1)
        b=0;
        lineU.setBounds(xu,2,70,70);
        lineD.setBounds(xd,120,70,70);
        if(a==1)
        xu--;
        if(b==1)
        xd--;
        if(a==0)
        xu++;
        if(b==0)
        xd++;
    }
}

