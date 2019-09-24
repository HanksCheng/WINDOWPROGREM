import javax.swing.*;

import java.awt.event.*;

import java.awt.*;
public class mainframe1 extends JFrame{
    private JButton jbtn0=new JButton("0");
    private JButton jbtns=new JButton(".");
    private JButton jbtne=new JButton("=");
    private JButton jbtnp=new JButton("+");
    private JButton jbtn1=new JButton("1");
    private JButton jbtn2=new JButton("2");
    private JButton jbtn3=new JButton("3");
    private JButton jbtnm=new JButton("-");
    private JButton jbtn4=new JButton("4");
    private JButton jbtn5=new JButton("5");
    private JButton jbtn6=new JButton("6");
    private JButton jbtnt=new JButton("*");
    private JButton jbtn7=new JButton("7");
    private JButton jbtn8=new JButton("8");
    private JButton jbtn9=new JButton("9");
    private JButton jbtna=new JButton("/");
    private JLabel jlb=new JLabel("0");
    private JPanel jpn=new JPanel(new GridLayout(4,4,3,3));
    private Container cp;
    public mainframe1(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.setLayout(new GridLayout(4,4,3,3));
        this.setBounds(0,0,1600,900);
        cp.add(jlb, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);
        jpn.add(jbtn0);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jbtn3);
        jpn.add(jbtn4);
        jpn.add(jbtn5);
        jpn.add(jbtn6);
        jpn.add(jbtn7);
        jpn.add(jbtn8);
        jpn.add(jbtn9);
        jpn.add(jbtns);
        jpn.add(jbtnp);
        jpn.add(jbtnm);
        jpn.add(jbtnt);
        jpn.add(jbtna);
        jpn.add(jbtne);
        jlb.setHorizontalTextPosition(JLabel.RIGHT);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         jbtn1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 JButton jbtn1 =(JButton) e.getSource();
                 jlb.setText(jlb.getText()+jbtn1.getText());
             }
         });

         jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn2 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn2.getText());
            }
        });

        jbtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn3 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn3.getText());
            }
        });
        
        jbtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn4 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn4.getText());
            }
        });

        jbtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn5 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn5.getText());
            }
        });

        jbtn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn6 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn6.getText());
            }
        });

        jbtn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn7 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn7.getText());
            }
        });

        jbtn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn8 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn8.getText());
            }
        });

        jbtn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn9 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn9.getText());
            }
        });

        jbtn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton jbtn0 =(JButton) e.getSource();
                jlb.setText(jlb.getText()+jbtn0.getText());
            }
        });
    }
}