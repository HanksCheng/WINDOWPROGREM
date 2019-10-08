import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cal  extends JFrame{
    private static JFrame frm=new JFrame("¤pºâ½L");
    private static JPanel pn1=new JPanel(new GridLayout(4,3));//§â0~9¡B=¡BC³o¨Ç¥ó¨Ì§Ç±Æ¤J4*3ªºGRIDLAYOUT
    private static JPanel pn2=new JPanel(new GridLayout(4,1));//§â+-*/¨Ì§Ç±Æ¤J4*1­ÓGRIDLAYOUT
    private static JLabel lab=new JLabel("0",SwingConstants.RIGHT);

    private static Button cn,ad,sub,mul,div,amo;//¨Ì§Ç¬°Âk¹s¡B+¡B-¡B*¡B/¡B=

    private static Button digits[]=new Button[10];//0~9ªº¼Æ¦r

    private static long num;//¦s©ñµ²ªG

    private static byte op;//¥Nªí¹Bºâ²Å¸¹

    public cal(){
          init();
    }
    private void init(){

        frm.setLayout(null);
        frm.setBounds(100,100,770,970);
        frm.setResizable(true);
        lab.setBounds(10,30,740,100);
        lab.setBackground(new Color(120,240,150));
        pn1.setBounds(10,130,570,800);
        pn2.setBounds(580,130,170,800);

        pn1.setFont(new Font("Arial", Font.PLAIN, 40));
        pn2.setFont(new Font("Arial", Font.PLAIN, 40));  //³]©w¦r§Î¡B¤j¤p 
        lab.setFont(new Font("Arial", Font.PLAIN, 40));
    
        for(int i=9;i>=0;i--){
            digits[i]=new Button(Integer.toString(i));
            pn1.add(digits[i]);                         //0~9ªº²K¥[¥Îfor°j°é¨Ó¼g
            digits[i].addActionListener(new ActLis());
        }
        
        cn=new Button("C");
        pn1.add(cn);
        cn.addActionListener(new ActLis());//²K¥[Âk¹s
        
        amo=new Button("=");
        pn1.add(amo);
        amo.addActionListener(new ActLis());//²K¥[µ¥©ó
        
        ad=new Button("+");
        pn2.add(ad);
        ad.addActionListener(new ActLis());//²K¥[¥[
        
        sub=new Button("-");
        pn2.add(sub);
        sub.addActionListener(new ActLis());//²K¥[´î
        
        mul=new Button("*");
        pn2.add(mul);
        mul.addActionListener(new ActLis());//²K¥[­¼
        
        div=new Button("/");
        pn2.add(div);
        div.addActionListener(new ActLis());//²K¥[°£
    
        frm.addWindowListener(new WindowAdapter(){public void
        windowClosing(WindowEvent e){System.exit(0);}});//«ö¥k¤WX¥i¥HÃö³¬µ{¦¡  

        frm.add(lab);
        frm.add(pn1);
        frm.add(pn2);//²K¥[¦ULABEL¥H¤ÎPANEL

        frm.setVisible(true);
    }

public static class ActLis implements ActionListener
{
    public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException{
        long result;//¦s©ñ¥Ñ¦r¦êÂà¦¨ªº¼Æ­È
          
            Button btn=(Button) e.getSource();
            try{      
                  for(int i=0;i<=9;i++){
                    if(btn==digits[i]){
                        output_digit(digits[i]);//ÅýLABEL¤ºªºNUM GET¨ì1~9
                        break;
                    }
                }
                if(btn==cn){
                    result=0L;//§âNUMÂk0
                   num=0L;
                    op=0;
                    lab.setText(Long.toString(num));
                }else if(btn==ad){//¥[;¨ÏOP=1´N¥i¥ÎCASE¨Ó¥s¥X+
                    save_num(ad);
                    op=1;
                }else if(btn==sub){//´î;¨ÏOP=2´N¥i¥ÎCASE¨Ó¥s¥X-
                    save_num(sub);
                    op=2;
                }else if(btn==mul){//­¼;¨ÏOP=3´N¥i¥ÎCASE¨Ó¥s¥X*
                    save_num(mul);                   
                    op=3;
                }else if(btn==div){//°£;¨ÏOP=4´N¥i¥ÎCASE¨Ó¥s¥X/
                    save_num(div);
                    op=4;
                }else if(btn==amo){
                    result=Long.parseLong(lab.getText());//µ¥©ó¨ÏNUM¶]¥X¨Ó
               
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
                    lab.setText(Long.toString(num));//¿é¥X¹Bºâ«áªºµ²ªG¨ìÅã¥Ü¾¹
                }
        }catch(NumberFormatException ne){
      }catch(ArithmeticException ae){  //§ì·N¥~¥Îªº½Ð¦Ñ®v¸Ñ´b®Ñ¤W­±±Ðªº
      }   
  }
    
    private void output_digit(Button btn){
  lab.setText(Long.toString(Long.parseLong(lab.getText()+btn.getLabel())));//¿é¥X¼Æ­È¨ìÅã¥Ü¾¹
  }
     
    private void save_num(Button oper){
        num=Long.parseLong(lab.getText());//§â²Ä¤@²Õ¼Æ­ÈÀx¦sþ¨Ó
         lab.setText(Long.toString(0L));
    }
}
}