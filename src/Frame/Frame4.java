/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author sonys
 */
public class Frame4 extends JFrame{
    private String nomor;
    public Frame4() {
        JLabel l1=new JLabel("SILAKAN MEMASUKAN");
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(245, 50, 920, 50);
        
        JLabel l2=new JLabel("NOMOR VIRTUAL ACCOUNT ANDA ");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(135, 100, 920, 50);
        
        JTextField va=new JTextField();
        va.setFont(new Font(va.getName(), Font.PLAIN, 40));
        va.setBounds(215, 180, 500, 50);
        va.setHorizontalAlignment(JTextField.CENTER);
        va.setBorder(null);
        va.setBackground(Color.getColor("eeeeee"));
        nomor=va.getName();
        
        
        JLabel benar=new JLabel("BENAR > ");
        benar.setFont(new Font(benar.getName(), Font.PLAIN, 40));
        benar.setBounds(730, 355, 460, 50);
        benar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame5 frame5=new Frame5();
                setVisible(false);
                frame5.setVisible(true);
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
        
        JLabel l5=new JLabel("SALAH > ");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(735, 435, 460, 50);
        
        JLabel l6=new JLabel("UNTUK  MEMBATALKAN  TRANSAKSI ");
        l6.setFont(new Font(l6.getName(), Font.PLAIN, 40));
        l6.setBounds(100, 560, 920, 50);
        
        JLabel l7=new JLabel("TEKAN  ‘CANCEL’ ");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 40));
        l7.setBounds(285, 630, 920, 50);
        
        add(l1);
        add(l2);
        add(va);
        add(benar);
        add(l5);
        add(l6);
        add(l7);

        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
    public String virtualaccount(){
        return nomor;
    }
}
