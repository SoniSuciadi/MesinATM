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
public class Frame7 extends JFrame{
        
    public Frame7(){
        JLabel l1=new JLabel("TRANSAKSI ANDA SUDAH SELESAI ");
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(130, 50, 920, 50);
        
        JLabel l2=new JLabel("APAKAH ANDA INGIN MELAKUKAN ");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(135, 170, 920, 50);
        
        JLabel l3=new JLabel("TRANSAKSI LAIN ?");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 40));
        l3.setBounds(270, 230, 920, 50);
        
        JLabel ya=new JLabel("YA > ");
        ya.setFont(new Font(ya.getName(), Font.PLAIN, 40));
        ya.setBounds(800, 420, 460, 50);
        ya.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame1 frame1=new Frame1();
                frame1.setVisible(true);
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
        JLabel tidak=new JLabel("TIDAK > ");
        tidak.setFont(new Font(tidak.getName(), Font.PLAIN, 40));
        tidak.setBounds(735, 500, 460, 50);
        tidak.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                setVisible(false);
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
        JLabel l5=new JLabel("UNTUK  MEMBATALKAN  TRANSAKSI ");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(100, 580, 920, 50);
        
        JLabel l6=new JLabel("TEKAN  ‘CANCEL’ ");
        l6.setFont(new Font(l6.getName(), Font.PLAIN, 40));
        l6.setBounds(285, 630, 920, 50);
        
        add(l1);
        add(l2);
        add(l3);
        add(tidak);
        add(l5);
        add(ya);
        add(l6);

        
        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
    
}
