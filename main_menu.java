import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class main_menu implements ActionListener
{
    JFrame win=new JFrame();
    JLabel title=new JLabel("Num Fun");
    JLabel lineD=new JLabel("#######");
    JLabel lineU=new JLabel("#######");
    JLabel exp=new JLabel();
    JLabel watch=new JLabel();
    JLabel RGo=new JLabel();
    JLabel help=new JLabel();
    JLabel ins=new JLabel();
    JLabel Score=new JLabel();
    JLabel Shead=new JLabel();
    JLabel imagel=new JLabel();
    Help H=new Help();
    Calculator c = new Calculator();
    RandomGen RG=new RandomGen();
    Sound S=new Sound();
    AnimTitle AT=new AnimTitle(title);
    Timer tcc=new Timer(70,AT);
    AnimLine AL=new AnimLine(lineU,lineD);
    Timer lpc=new Timer(1,AL);
    Timer wc=new Timer(1000,this);
    String num1,num2,ans="(no answer)",op,Rans;
    byte n=1,a=0,sec=30;
    short score=0;
    public void startw()
    {
        win.setSize(650,500);
		win.setResizable(false);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        //win.getContentPane().setBackground(Color.black);
        ImageIcon Image=new ImageIcon("Assets/spidy.jpg");
        imagel.setBounds(1,1,650,500);
        imagel.setIcon(Image);
        win.setLayout(null);
        //Title
        title.setFont(new Font("Papyrus",Font.BOLD,100));
        title.setForeground(Color.WHITE);
        title.setBounds(100,50,500,100);
        //LineD
        lineD.setFont(new Font("Book Antiqua",Font.BOLD,70));
        lineD.setForeground(Color.BLUE);
        lineD.setBounds(590,120,70,70);
        //lineU
        lineU.setFont(new Font("Book Antiqua",Font.BOLD,70));
        lineU.setForeground(Color.BLUE);
        lineU.setBounds(1,2,70,70);
        //Play Button
        JButton pbtn=new JButton("PRESS");
        pbtn.setBounds(210,320,200,100);
        pbtn.setBackground(Color.black);
        pbtn.setForeground(Color.blue);
        pbtn.setFont(new Font("Arial",Font.PLAIN,40));
        pbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                S.playB("press");
                tcc.stop();
                S.playM("stop");
                gamew();
            }
        });
        win.add(title);
        win.add(lineD);
        win.add(lineU);
        win.add(pbtn);
        win.add(imagel);
        win.setVisible(true);
        //Timer 
        tcc.start();
        lpc.start();
        S.playM("intro");
    }
    public void gamew()
    {
        ImageIcon Image=new ImageIcon("Assets/alley.jpg");
        imagel.setBounds(1,1,650,500);
        imagel.setIcon(Image);
        win.setVisible(false);
        tcc.stop();
        lpc.stop();
        win.getContentPane().removeAll();
        win.getContentPane().setBackground(Color.black);
        //ins
        ins.setFont(new Font("Arial",Font.PLAIN,30));
        ins.setForeground(Color.yellow);
        ins.setBounds(50,5,600,30);
        ins.setText("You Have To Calculate And Write Answer");
        //RGo
        RGo.setFont(new Font("Arial",Font.PLAIN,50));
        RGo.setForeground(Color.red);
        RGo.setBounds(220,50,300,70);
        RGo.setText("READY?");
        //help
        help.setFont(new Font("Arial",Font.PLAIN,50));
        help.setForeground(Color.blue);
        help.setBounds(90,100,600,70);
        help.setText("Press Enter To Start!");
        //exp
        exp.setText(null);
        exp.setFont(new Font("Arial",Font.PLAIN,50));
        exp.setForeground(Color.red);
        exp.setBounds(230,200,654,70);
        //Watch
        watch.setFont(new Font("Arial",Font.PLAIN,50));
        watch.setForeground(Color.blue);
        watch.setBounds(500,10,100,100);
        watch.setText("1m");
        //Qbtn
        JButton Qbtn=new JButton("QUIT");
        Qbtn.setFont(new Font("Arial",Font.PLAIN,40));
        Qbtn.setForeground(Color.blue);
        Qbtn.setBackground(Color.magenta);
        Qbtn.setBounds(5,400,200,50);
        Qbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                S.playB("press");
                n=1;
                win.setVisible(false);
                win.getContentPane().removeAll();
                wc.stop();
                sec=60;
                score=0;
                S.playM("stop");
                startw();
            }
        });
        //Hbtn
        JButton Cbtn=new JButton("HELP");
        Cbtn.setFont(new Font("Arial",Font.PLAIN,40));
        Cbtn.setForeground(Color.blue);
        Cbtn.setBackground(Color.magenta);
        Cbtn.setBounds(430,400,200,50);
        Cbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                S.playB("press");
                H.calcW();
            }
        });
        //Calc
        JButton Hbtn=new JButton("Calc");
        Hbtn.setFont(new Font("Arial",Font.PLAIN,40));
        Hbtn.setForeground(Color.blue);
        Hbtn.setBackground(Color.magenta);
        Hbtn.setBounds(430,340,200,50);
        Hbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                S.playB("press");
                c.calc();
            }
        });
        //ansf
        JTextField ansf=new JTextField(7);
        ansf.setBounds(210,280,180,50);
        ansf.setBackground(Color.cyan);
        ansf.setForeground(Color.white);
        ansf.setFont(new Font("Arial",Font.PLAIN,50));
        ansf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                if(n==1)
                {
                    RGo.setBounds(270,50,300,70);
                    RGo.setForeground(Color.green);
                    RGo.setText("GO!");
                    help.setText(null);
                    ins.setText(null);
                    win.setVisible(false);
                    win.add(watch);
                    win.add(imagel);
                    win.setVisible(true);
                    wc.setInitialDelay(1000);
                    wc.start();
                    n=2;
                    S.playM("gameM");
                }
                Rans=ansf.getText();
                ansf.setText(null);
                if(Rans.equals(ans))
                {
                     JOptionPane.showMessageDialog(null,"Correct ! ");
                    S.playB("yes");
                    score++;
					sec=30;
                }
                else if(!(Rans.equals(ans))&&!(Rans.equals(""))) 
                {
                    JOptionPane.showMessageDialog(null,"Wrong! corect answer = "+ans);
                    S.playB("no");
            }
                num1 = RG.getnum1();
                num2 = RG.getnum2();
                op = RG.getop();
                ans = RG.getans();
                exp.setText(num1+op+num2);
            }
        });
        //adding
        win.add(exp);
        win.add(ansf);
        win.add(RGo);
        win.add(help);
        win.add(ins);
        win.add(Qbtn);
        win.add(Hbtn);
        win.add(Cbtn);
        win.add(imagel);
        win.setVisible(true);
    }
    public void scorew()
    {
        S.playM("stop");
        wc.stop();
        win.setVisible(false);
        win.getContentPane().removeAll();
        //Score
        Score.setFont(new Font("Arial",Font.PLAIN,50));
        Score.setForeground(Color.blue);
        Score.setBounds(300,250,200,100);
        Score.setText(Short.toString(score));
        if(score>=5)
        S.playB("good job");
        else
        S.playB("luck");
        //Shead
        Shead.setFont(new Font("Arial",Font.PLAIN,50));
        Shead.setForeground(Color.green);
        Shead.setBounds(200,100,300,200);
        Shead.setText("Your Score");
        //rbtn
        JButton rbtn=new JButton("HOME");
        rbtn.setFont(new Font("Arial",Font.PLAIN,40));
        rbtn.setForeground(Color.blue);
        rbtn.setBackground(Color.magenta);
        rbtn.setBounds(5,400,200,50);
        rbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                S.playB("press");
                win.setVisible(false);
                win.getContentPane().removeAll();
                n=1;
                sec=60;
                score=0;
                startw();
            }
        });
        //adding
        win.add(Shead);
        win.add(Score);
        win.add(rbtn);
        win.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        sec--;
        watch.setText(sec+"s");
        if(sec==0)
        {
            win.setVisible(false);
            win.getContentPane().removeAll();
            scorew();
        }
        if(sec==10)
        watch.setForeground(Color.red);
    }
}