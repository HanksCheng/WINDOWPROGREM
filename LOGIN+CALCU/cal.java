import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class cal  extends JFrame{
    private static JFrame frm=new JFrame("�p��L");
    private static JPanel pn1=new JPanel(new GridLayout(4,3));//��0~9�B=�BC�o�ǥ�̧ǱƤJ4*3��GRIDLAYOUT
    private static JPanel pn2=new JPanel(new GridLayout(4,1));//��+-*/�̧ǱƤJ4*1��GRIDLAYOUT
    private static JLabel lab=new JLabel("0",SwingConstants.RIGHT);

    private static Button cn,ad,sub,mul,div,amo;//�̧Ǭ��k�s�B+�B-�B*�B/�B=

    private static Button digits[]=new Button[10];//0~9���Ʀr

    private static long num;//�s�񵲪G

    private static byte op;//�N��B��Ÿ�

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
        pn2.setFont(new Font("Arial", Font.PLAIN, 40));  //�]�w�r�ΡB�j�p 
        lab.setFont(new Font("Arial", Font.PLAIN, 40));
    
        for(int i=9;i>=0;i--){
            digits[i]=new Button(Integer.toString(i));
            pn1.add(digits[i]);                         //0~9���K�[��for�j��Ӽg
            digits[i].addActionListener(new ActLis());
        }
        
        cn=new Button("C");
        pn1.add(cn);
        cn.addActionListener(new ActLis());//�K�[�k�s
        
        amo=new Button("=");
        pn1.add(amo);
        amo.addActionListener(new ActLis());//�K�[����
        
        ad=new Button("+");
        pn2.add(ad);
        ad.addActionListener(new ActLis());//�K�[�[
        
        sub=new Button("-");
        pn2.add(sub);
        sub.addActionListener(new ActLis());//�K�[��
        
        mul=new Button("*");
        pn2.add(mul);
        mul.addActionListener(new ActLis());//�K�[��
        
        div=new Button("/");
        pn2.add(div);
        div.addActionListener(new ActLis());//�K�[��
    
        frm.addWindowListener(new WindowAdapter(){public void
        windowClosing(WindowEvent e){System.exit(0);}});//���k�WX�i�H�����{��  

        frm.add(lab);
        frm.add(pn1);
        frm.add(pn2);//�K�[�ULABEL�H��PANEL

        frm.setVisible(true);
    }

public static class ActLis implements ActionListener
{
    public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException{
        long result;//�s��Ѧr���ন���ƭ�
          
            Button btn=(Button) e.getSource();
            try{      
                  for(int i=0;i<=9;i++){
                    if(btn==digits[i]){
                        output_digit(digits[i]);//��LABEL����NUM GET��1~9
                        break;
                    }
                }
                if(btn==cn){
                    result=0L;//��NUM�k0
                   num=0L;
                    op=0;
                    lab.setText(Long.toString(num));
                }else if(btn==ad){//�[;��OP=1�N�i��CASE�ӥs�X+
                    save_num(ad);
                    op=1;
                }else if(btn==sub){//��;��OP=2�N�i��CASE�ӥs�X-
                    save_num(sub);
                    op=2;
                }else if(btn==mul){//��;��OP=3�N�i��CASE�ӥs�X*
                    save_num(mul);                   
                    op=3;
                }else if(btn==div){//��;��OP=4�N�i��CASE�ӥs�X/
                    save_num(div);
                    op=4;
                }else if(btn==amo){
                    result=Long.parseLong(lab.getText());//�����NUM�]�X��
               
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
                    lab.setText(Long.toString(num));//��X�B��᪺���G����ܾ�
                }
        }catch(NumberFormatException ne){
      }catch(ArithmeticException ae){  //��N�~�Ϊ��ЦѮv�Ѵb�ѤW���Ъ�
      }   
  }
    
    private void output_digit(Button btn){
  lab.setText(Long.toString(Long.parseLong(lab.getText()+btn.getLabel())));//��X�ƭȨ���ܾ�
  }
     
    private void save_num(Button oper){
        num=Long.parseLong(lab.getText());//��Ĥ@�ռƭ��x�s����
         lab.setText(Long.toString(0L));
    }
}
}