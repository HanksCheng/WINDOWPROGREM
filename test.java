import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class main
{
    private static JFrame frm=new JFrame("小算盤");
    private static JPanel pn1=new JPanel(new GridLayout(4,3));//把0~9、=、C這些件依序排入4*3的GRIDLAYOUT
    private static JPanel pn2=new JPanel(new GridLayout(4,1));//把+-*/依序排入4*1個GRIDLAYOUT
    private static JLabel lab=new JLabel("0",SwingConstants.RIGHT);

    private static Button cn,ad,sub,mul,div,amo;//依序為歸零、+、-、*、/、=

    private static Button digits[]=new Button[10];//0~9的數字

    private static long num;//存放結果

    private static byte op;//代表運算符號

public static void main(String args[])
{
    frm.setLayout(null);
    frm.setBounds(100,50,770,970);
    frm.setResizable(true);
    lab.setBounds(10,30,740,100);
    lab.setBackground(new Color(120,240,150));
    pn1.setBounds(10,130,570,800);
    pn2.setBounds(580,130,170,800);

    pn1.setFont(new Font("Arial", Font.PLAIN, 40));
    pn2.setFont(new Font("Arial", Font.PLAIN, 40));  //設定字形、大小 
    lab.setFont(new Font("Arial", Font.PLAIN, 40));
  
    for(int i=9;i>=0;i--){
        digits[i]=new Button(Integer.toString(i));
        pn1.add(digits[i]);                         //0~9的添加用for迴圈來寫
        digits[i].addActionListener(new ActLis());
    }
    
    cn=new Button("C");
    pn1.add(cn);
    cn.addActionListener(new ActLis());//添加歸零
    
    amo=new Button("=");
    pn1.add(amo);
    amo.addActionListener(new ActLis());//添加等於
    
    ad=new Button("+");
    pn2.add(ad);
    ad.addActionListener(new ActLis());//添加加
    
    sub=new Button("-");
    pn2.add(sub);
    sub.addActionListener(new ActLis());//添加減
    
    mul=new Button("*");
    pn2.add(mul);
    mul.addActionListener(new ActLis());//添加乘
    
    div=new Button("/");
    pn2.add(div);
    div.addActionListener(new ActLis());//添加除
   
    frm.addWindowListener(new WindowAdapter(){public void
    windowClosing(WindowEvent e){System.exit(0);}});//按右上X可以關閉程式  

    frm.add(lab);
    frm.add(pn1);
    frm.add(pn2);//添加各LABEL以及PANEL

    frm.setVisible(true);
}

public static class ActLis implements ActionListener
{
    public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException{
        long result;//存放由字串轉成的數值
          
            Button btn=(Button) e.getSource();
            try{      
                  for(int i=0;i<=9;i++){
                    if(btn==digits[i]){
                        output_digit(digits[i]);//讓LABEL內的NUM GET到1~9
                        break;
                    }
                }
                if(btn==cn){
                    result=0L;//把NUM歸0
                   num=0L;
                    op=0;
                    lab.setText(Long.toString(num));
                }else if(btn==ad){//加;使OP=1就可用CASE來叫出+
                    save_num(ad);
                    op=1;
                }else if(btn==sub){//減;使OP=2就可用CASE來叫出-
                    save_num(sub);
                    op=2;
                }else if(btn==mul){//乘;使OP=3就可用CASE來叫出*
                    save_num(mul);                   
                    op=3;
                }else if(btn==div){//除;使OP=4就可用CASE來叫出/
                    save_num(div);
                    op=4;
                }else if(btn==amo){
                    result=Long.parseLong(lab.getText());//等於使NUM跑出來
               
                    switch(op){
                        case 1:
                            num+=result;
                        break;
                        case 2:
                            num-=result;
                            break;
                        case 3:
                            num*=result;
                            break;
                        case 4:
                            num/=result;
                            break;
                        default:
                    }
                    result=0L;
                    lab.setText(Long.toString(num));//輸出運算後的結果到顯示器
                }
        }catch(NumberFormatException ne){
      }catch(ArithmeticException ae){  //抓意外用的請老師解惑書上面教的
      }   
  }
    
    private void output_digit(Button btn){
  lab.setText(Long.toString(Long.parseLong(lab.getText()+btn.getLabel())));//輸出數值到顯示器
  }
     
    private void save_num(Button oper){
        num=Long.parseLong(lab.getText());//把第一組數值儲存��來
         lab.setText(Long.toString(0L));
    }
}
}