import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Help
{
    public void calcW()
    {
        calc C=new calc();
        ImageIcon calc=new ImageIcon("Assets/calculator.png");
        JLabel LI=new JLabel();
        LI.setBounds(1,1,400,300);
        LI.setIcon(calc);
        JFrame Cfrm=new JFrame();
        Cfrm.setSize(400,300);
		Cfrm.setResizable(false);
        Cfrm.setDefaultCloseOperation(Cfrm.DISPOSE_ON_CLOSE);
        Cfrm.setLayout(null);
        JLabel title=new JLabel("Help !");
        title.setFont(new Font("Arial",Font.BOLD,50));
        title.setForeground(Color.black);
        title.setBounds(15,20,400,50);
        JLabel Le=new JLabel("EXPRESSION =");
        Le.setFont(new Font("Arial",Font.BOLD,30));
        Le.setForeground(Color.black);
        Le.setBounds(1,100,230,30);
        JLabel La=new JLabel("ANSWER        =");
        La.setFont(new Font("Arial",Font.BOLD,30));
        La.setForeground(Color.black);
        La.setBounds(1,150,230,30);
        JLabel ans=new JLabel();
        ans.setBounds(240,150,150,30);
        ans.setFont(new Font("Arial",Font.BOLD,30));
        ans.setForeground(Color.black);
        JLabel wrong=new JLabel();
        wrong.setBounds(100,210,300,40);
        wrong.setFont(new Font("Arial",Font.BOLD,30));
        wrong.setForeground(Color.black);
        JTextField exp=new JTextField(1);
        exp.setFont(new Font("Arial",Font.BOLD,30));
        exp.setBackground(Color.black);
        exp.setForeground(Color.white);
        exp.setBounds(230,100,150,30);
        exp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                wrong.setText(null);
                try
                {
                    ans.setText(C.getans(exp.getText()));
                }
                catch(Exception e)
                {
                    wrong.setText("Wrong Input !");
                }
                exp.setText(null);
            }
        });
        Cfrm.add(title);
        Cfrm.add(Le);
        Cfrm.add(exp);
        Cfrm.add(La);
        Cfrm.add(ans);
        Cfrm.add(wrong);
        Cfrm.add(LI);
        Cfrm.setVisible(true);
    }
}

