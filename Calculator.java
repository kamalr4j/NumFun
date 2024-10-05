import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Calculator extends JFrame implements ActionListener
{
    char o;
    int ctr=0;
    String value="", cv="", oBtn;
    Double ans, v1, v2;
    Double nberConverted;
    JPanel east, south;
    JLabel label;
    JButton n0, n1, n2, n3, n4, n5, n6, n7, n8,n9;
    JButton bAdd, bSub, bMul, bDiv, bPer, bSqrt, bFrac, bInt, bDot,bCE, equals, backspace, clear;
    String name;
    Calculator()
    {
            east = new JPanel();
            south = new JPanel();
            label = new JLabel("Calc - By AK_11");
            n0 = new JButton   ("0");
            n0.setMnemonic(KeyEvent.VK_NUMPAD0);
            n1 = new JButton   ("1");
            n1.setMnemonic(KeyEvent.VK_NUMPAD1);
            n2 = new JButton   ("2");
            n2.setMnemonic(KeyEvent.VK_NUMPAD2);
            n3 = new JButton   ("3");
            n3.setMnemonic(KeyEvent.VK_NUMPAD3);
            n4 = new JButton   ("4");
            n4.setMnemonic(KeyEvent.VK_NUMPAD4);
            n5 = new JButton   ("5");
            n5.setMnemonic(KeyEvent.VK_NUMPAD5);
            n6 = new JButton   ("6");
            n6.setMnemonic(KeyEvent.VK_NUMPAD6);
            n7 = new JButton   ("7");
            n7.setMnemonic(KeyEvent.VK_NUMPAD7);
            n8 = new JButton   ("8");
            n8.setMnemonic(KeyEvent.VK_NUMPAD8);
            n9 = new JButton   ("9");
            n9.setMnemonic(KeyEvent.VK_NUMPAD9);
            bAdd = new JButton   ("+");
            bAdd.setMnemonic(KeyEvent.VK_ADD);
            bSub = new JButton   ("-");
            bSub.setMnemonic(KeyEvent.VK_SUBTRACT);
            bMul = new JButton   ("x");
            bMul.setMnemonic(KeyEvent.VK_MULTIPLY);
            bDiv = new JButton   ("/");
            bDiv.setMnemonic(KeyEvent.VK_DIVIDE);
            bPer = new JButton   ("%");
            bSqrt = new JButton  ("sqrt");
            bFrac = new JButton  ("1/x");
            bInt = new JButton   ("+/-");
            bDot = new JButton   (".");
            bDot.setMnemonic(KeyEvent.VK_DECIMAL);
            bCE = new JButton    ("CE");
            equals = new JButton     ("=");
            equals.setMnemonic(KeyEvent.VK_ENTER);
            backspace = new JButton  ("Backspace");
            backspace.setMnemonic(KeyEvent.VK_BACK_SPACE);
            clear = new JButton  ("C");
            clear.setMnemonic(KeyEvent.VK_C);

            //label.setText("Welcome to Calc");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            east.add(backspace);
            east.add(bCE);
            east.add(clear);
            south.add(n7);
            south.add(n8);
            south.add(n9);
            south.add(bDiv);
            south.add(bSqrt);
            south.add(n4);
            south.add(n5);
            south.add(n6);
            south.add(bMul);
            south.add(bPer);
            south.add(n1);
            south.add(n2);
            south.add(n3);
            south.add(bSub);
            south.add(bFrac);
            south.add(n0);
            south.add(bInt);
            south.add(bDot);
            south.add(bAdd);
            south.add(equals);

            east.setLayout(new GridLayout (3, 1, 0,5) );
            south.setLayout(new GridLayout (4, 3, 5, 5) );
            setTitle("Calc");
            setLayout(new BorderLayout() );
            setResizable(false);

            add(label,BorderLayout.CENTER);
            add(east,BorderLayout.EAST);
            add(south,BorderLayout.SOUTH);;
            pack();

            Toolkit toolkit = getToolkit();
            Dimension size = toolkit.getScreenSize();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);

            clear.addActionListener(this);
            bCE.addActionListener(this);
            n0.addActionListener(this);
            n1.addActionListener(this);
            n2.addActionListener(this);
            n3.addActionListener(this);
            n4.addActionListener(this);
            n5.addActionListener(this);
            n6.addActionListener(this);
            n7.addActionListener(this);
            n8.addActionListener(this);
            n9.addActionListener(this);
            bAdd.addActionListener(this);
            bSub.addActionListener(this);
            bMul.addActionListener(this);
            bDiv.addActionListener(this);
            bPer.addActionListener(this);
            bInt.addActionListener(this);
            bSqrt.addActionListener(this);
            bFrac.addActionListener(this);
            bDot.addActionListener(this);
            equals.addActionListener(this);
            backspace.addActionListener(this);
        }
        public void actionPerformed(ActionEvent AK)
        {
            try{
            if(AK.getSource()==n0){
                value+=0;
                label.setText(value);
            }
            if(AK.getSource()==n1){
                value+=1;
                label.setText(value);
            }
            if(AK.getSource()==n2){
                value+=2;
                label.setText(value);
            }
            if(AK.getSource()==n3){
                value+=3;
                label.setText(value);
            }
            if(AK.getSource()==n4){
                value+=4;
                label.setText(value);
            }
            if(AK.getSource()==n5){
                value+=5;
                label.setText(value);
            }
            if(AK.getSource()==n6){
                value+=6;
                label.setText(value);
            }
            if(AK.getSource()==n7){
                value+=7;
                label.setText(value);
            }
            if(AK.getSource()==n8){
                value+=8;
                label.setText(value);
            }
            if(AK.getSource()==n9){
                value+=9;
                label.setText(value);
            }
            if (AK.getSource() == bAdd){
                v1 = Double.parseDouble( label.getText() );
                ctr=0;
                o = '+';
                value="";
                label.setText("" +value);
            }

            if (AK.getSource() == bSub){
                    v1 = Double.parseDouble( label.getText() );
                    ctr=0;
                    o = '-';
                    value="";
                    label.setText("" +value);
            }

            if (AK.getSource() == bMul){
                    v1 = Double.parseDouble( label.getText() );
                    ctr=0;
                    o = 'x';
                    value="";
                    label.setText("" +value);
            }

            if (AK.getSource() == bDiv){
                    v1 = Double.parseDouble( label.getText() );
                    ctr=0;
                    o = '/';
                    value="";
                    label.setText("" +value);
            }

            if (AK.getSource() == bPer){
                    v1 = Double.parseDouble( label.getText() );
                    ctr=0;
                    value="";
                    ans = (v1/100);
                    label.setText("" +ans);
            }
            if(AK.getSource()==equals){
                        value="";
                        v2 = Double.parseDouble(label.getText());

                    if(o=='+'){
                        ctr=0;
                        ans = v1 + v2;
                        label.setText("" +ans);
                        value="";
                        v1=null;
                        v2=null;
                    }
                    else if(o=='-'){
                        ctr=0;
                        ans = v1 - v2;
                        label.setText("" +ans);
                        value="";
                        v1=null;
                        v2=null;
                    }
                    else if(o=='x'){
                        ctr=0;
                        ans = v1 * v2;
                        label.setText("" +ans);
                        value="";
                        v1=null;
                        v2=null;
                    }
                    else if(o=='/'){
                        ctr=0;
                        ans = v1 / v2;
                        label.setText("" +ans);
                        value="";
                        v1=null;
                        v2=null;
                    }
                    else if(o=='%'){
                        ctr=0;
                        ans = v1 % v2;
                        label.setText("" +ans);
                        value="";
                        v1=null;
                        v2=null;
                    }
                    else{}
            }
            if(AK.getSource()==clear){
                ctr=0;
                v1=null;
                v2=null;
                value="";
                ans=0.;
                label.setText("Done! ");

            }

            if(AK.getSource()==bCE){
                ctr=0;
                value="";
                label.setText("Screen cleared !");
            }

            if(AK.getSource() == bDot){
                if(ctr==0){
                        value+=".";
                        ctr+=1;
                        label.setText("" +value);
                }
                else{
                    System.out.print("");
                }

            }
            if(AK.getSource() == backspace){
                    value = value.substring(0, value.length()-1 );
                    label.setText("" +value);
            }
            if(AK.getSource() == bSqrt){
                ctr=0;
                value = "";
                v1 = Math.sqrt( Double.parseDouble( label.getText() ) );
                label.setText("" +v1);
            }
            if(AK.getSource() == bInt){
                ctr=0;
                nberConverted = ( Double.parseDouble(label.getText()) * -1 );
                value = "";
                label.setText("" +nberConverted);
                }
            if(AK.getSource() == bFrac){
                ctr=0;
                value = "";
                Double nberContainer = ( 1 / Double.parseDouble(label.getText() ) );
                label.setText("" +nberContainer);
            }
        }
        catch(StringIndexOutOfBoundsException str){}
        catch(NumberFormatException numfe){}
        catch(NullPointerException npe){}

    }
    void calc ()
    {
        Calculator s = new Calculator();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
