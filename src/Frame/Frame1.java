package Frame;

import Image.PIN;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Frame1 extends JFrame{
    public Frame1(){
        JLabel l1=new JLabel("SILAKAN");
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 45));
        l1.setBounds(500, 50, 500, 50);
        
        JLabel l2=new JLabel("MEMASUKAN");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 45));
        l2.setBounds(500, 100, 500, 50);
        
        JLabel l3=new JLabel("PIN ANDA");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 45));
        l3.setBounds(500, 150, 500, 50);
        
        JLabel l4=new JLabel("”JAGALAH KERAHASIAAN PIN ANDA”");
        l4.setFont(new Font(l4.getName(), Font.PLAIN, 45));
        l4.setBounds(60, 340, 900, 300);
        
        JLabel l5=new JLabel("-----------------------------------------------------");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 45));
        l5.setBounds(60, 390, 900, 300);
        
        JLabel l6=new JLabel("UNTUK  MEMBATALKAN  TRANSAKSI ");
        l6.setFont(new Font(l6.getName(), Font.PLAIN, 45));
        l6.setBounds(60, 440, 900, 300);
        
        JLabel l7=new JLabel("TEKAN  ‘CANCEL’ ");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 45));
        l7.setBounds(250, 490, 900, 300);
        
        JPasswordField password=new JPasswordField();
        password.setBounds(500, 250, 300, 70);
        password.setBorder(null);
        password.setBackground(Color.getColor("eeeeee"));
        password.setFont(new Font(password.getName(), Font.PLAIN, 40));
        
        JLabel benar=new JLabel("BENAR > ");
        benar.setFont(new Font(benar.getName(), Font.PLAIN, 40));
        benar.setBounds(730, 350, 460, 50);
        benar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame2 frame2=new Frame2();
                setVisible(false);
                frame2.setVisible(true);
          }

            @Override
            public void mousePressed(MouseEvent me) {
               
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
 
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
            }
        });
        
        PIN pin=new PIN();
        pin.setBounds(60, 50, 400,400 );
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(benar);
        add(password);
        add(pin);
        
        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
        

    }
}
