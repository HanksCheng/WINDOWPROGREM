import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainframe extends Frame{
    int x=0;
    private Button btn1=new Button();
    private Button btn2=new Button();
    private Button btn3=new Button();
    private Button btn4=new Button();
    private Button btn5=new Button();
    private Button btn6=new Button();
    private Button btn7=new Button();
    private Button btn8=new Button();
    private Button btn9=new Button();
    
    public mainframe(){
        init();
    }

    private void init(){
        setSize(700,300);
        setLocation(100,200);

        this.setLayout(new GridLayout(3,3,2,2));

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Button btnTemp= (Button) ae.getSource();
                if(x%2 ==0){
                    btnTemp.setBackground(new Color(0,111,225));
                    btnTemp.setLabel("X");
                }else{
                    btnTemp.setBackground(new Color(111,225,0));
                    btnTemp.setLabel("0");
                }
                x++;
                btnTemp.setEnabled(false);
                checkstate();
            }
        });
    }
    private void checkstate() {
        if((!btn1.getLabel().equals(""))&&
            btn1.getLabel().equals(btn2.getLabel())&&
            btn1.getLabel().equals(btn3.getLabel())){
            if(btn1.getLabel().equals("X")){
                javax.swing.JOptionPane.showMessageDialog(mainframe.this, "P1 WIN!!!");
            }else{
                javax.swing.JOptionPane.showMessageDialog(mainframe.this, "P2 WIN!!!");
            }
            }
        if((!btn1.getLabel().equals(""))&&
            btn1.getLabel().equals(btn2.getLabel())&&
            btn1.getLabel().equals(btn3.getLabel())){
            if(btn1.getLabel().equals("X")){
                javax.swing.JOptionPane.showMessageDialog(mainframe.this, "P1 WIN!!!");
            }else{
                javax.swing.JOptionPane.showMessageDialog(mainframe.this, "P2 WIN!!!");
            }
            }
        
    }
}