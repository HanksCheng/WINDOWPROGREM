import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomKeyboard extends JFrame{
    private Container cp;
    private JPasswordField jpf =new JPasswordField();
    private JButton btns[]=new JButton[12];
    private JPanel jpn=new JPanel(new GridLayout(3,4,2,2));
    private mainframe Login

    public RandomKeyboard(mainframe logfr){
        login=logfr;
        init();
    }
    private void init(){
        int data[]=new int[10];
        boolean flag =false;
        Random rnd=new Random();
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        int j=0;
        while(j<10){
            data[j]=rnd.nextInt(10);
            flag=true;
            int k=0;
            while(k<j && flag==true){
                if(data[k]==data[j]){
                    flag = false;
                }
                k++;
            }
            if(flag){
                j++;
            }
        }
        for(int i=0;i<10;i++){
            btns[i]=new JButton(Integer.toString(data[i]));
            jpn.add(btns[i]);
            btns[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JButton jbtn =(JButton) ae.getSource();
                    String ps= new String(jpf.getPassword());
                    jpf.setText(ps+jbtn.getText());
                    // String str=jpf.getPassword();
                    // System.out.println(jpf.getPassword().toString());
                }
            });
        }
        btns[10]=new JButton("SUBMIT");
        btns[11]=new JButton("CANCEL");
        jpn.add(btns[10]);
        jpn.add(btns[11]);
        cp.add(jpf,BorderLayout.NORTH);
        cp.add(jpn,BorderLayout.CENTER);

        btns[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                login.setPwData(new String(jpf.getPassword()));
                RandomKeyboard.this.dispose();
            }
        })
    }
}