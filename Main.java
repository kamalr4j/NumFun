import javax.swing.*;
class Main
{
    public static void main(String arg[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main_menu mm=new main_menu();
                mm.startw();
            }
    });
    }
}