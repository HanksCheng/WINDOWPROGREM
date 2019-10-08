import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    private Container cp;
    private JPanel jp=new JPanel(new GridLayout(2,3,0,0));
    private JLabel jlb1=new JLabel("    ID");
    private JLabel jlb2=new JLabel("    PASSWORD");
    private TextField lg=new TextField();
    private JPasswordField pas= new JPasswordField(20);
    private JButton jbts=new JButton("LOGIN");
    private JButton jbte=new JButton("Exit");
    public mainframe(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setSize(500,100);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jp.add(jlb1);
        jp.add(lg);
        jp.add(jbts);
        jp.add(jlb2);
        jp.add(pas);
        jp.add(jbte);
        jbte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ps= new String(pas.getPassword());
                System.out.println();
                if(lg.getText().equals("h304")&&ps.equals("23323456")){
                    JOptionPane.showMessageDialog(null,"SUCEED");
                    appframe cl=new appframe();
                    cl.setVisible(true);
                    mainframe.this.setVisible(false);
                    mainframe.this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
            }
        });
        cp.add(jp,BorderLayout.NORTH);
    }
}