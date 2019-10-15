import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class appframe extends JFrame{
    // private static JLabel lab=new JLabel();
    private JMenuBar mb = new JMenuBar();
    private JMenu demo=new JMenu("FUNTION");
    private JMenu demo2=new JMenu("GAME");
    private JMenuItem m1=new JMenuItem("calcu");
    private JMenuItem m2=new JMenuItem("exit");
    private JMenuItem m3=new JMenuItem("logout");
    private JMenuItem m4=new JMenuItem("LF2!!!");
    private JMenuItem m5=new JMenuItem("internalpane");
    
    private JDesktopPane desktop=new JDesktopPane();
    private JInternalFrame internalFrame1=new JInternalFrame("Encryptor",true,true,true,true);

    public appframe(){
        internalFrame1.setBounds(5,5,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(0,0,960,540);
        this.setLocation(100,100);
        this.setJMenuBar(mb);
        this.add(desktop);
        mb.add(demo);
        mb.add(demo2);
        demo.add(m1);
        demo.add(m2);
        demo.add(m3);
        demo.add(m5);
        demo2.add(m4);
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal cl=new cal();
                    cl.setVisible(true);
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                mainframe cl=new mainframe();
                cl.setVisible(true);
                appframe.this.setVisible(false);
                appframe.this.dispose();
            }
        });
        m5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
