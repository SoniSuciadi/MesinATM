/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author sonys
 */
public class Frame3 extends JFrame{
    public Frame3(){
        JLabel l1=new JLabel("SILAKAN MEMILIH TRANSAKSI");
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(165, 50, 920, 50);
        JLabel l2=new JLabel("UNTUK  MEMBATALKAN  TRANSAKSI ");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(100, 120, 920, 50);
        JLabel l3=new JLabel("TEKAN  ‘CANCEL’ ");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 40));
        l3.setBounds(285, 170, 920, 50);
        JLabel l4=new JLabel("< KE REK BCA ");
        l4.setFont(new Font(l4.getName(), Font.PLAIN, 40));
        l4.setBounds(10, 310, 460, 50);
        JLabel l5=new JLabel("< KE REK BANK LAIN ");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(10, 430, 460, 50);
        JLabel va=new JLabel("< KE REK BCA VIRTUAL  ");
        va.setFont(new Font(va.getName(), Font.PLAIN, 40));
        va.setBounds(10, 550, 500, 50);
        va.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame4 frame4=new Frame4();
                setVisible(false);
                frame4.setVisible(true);
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        JLabel l7=new JLabel("   ACCOUNT ");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 40));
        l7.setBounds(10, 600, 460, 50);
        JLabel l8=new JLabel("KE SAKUKU > ");
        l8.setFont(new Font(l8.getName(), Font.PLAIN, 40));
        l8.setBounds(640, 310, 460, 50);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(va);
        add(l7);
        add(l8);
        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
}
