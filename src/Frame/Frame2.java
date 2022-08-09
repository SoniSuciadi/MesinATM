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
public class Frame2 extends JFrame{

    public Frame2(){
        JLabel l1=new JLabel("SILAKAN MEMILIH TRANSAKSI");
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(165, 50, 920, 50);
        JLabel l2=new JLabel("UNTUK  MEMBATALKAN  TRANSAKSI ");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(100, 120, 920, 50);
        JLabel l3=new JLabel("TEKAN  ‘CANCEL’ ");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 40));
        l3.setBounds(285, 170, 920, 50);
        JLabel l4=new JLabel("< INFORMASI SALDO");
        l4.setFont(new Font(l4.getName(), Font.PLAIN, 40));
        l4.setBounds(10, 355, 460, 50);
        JLabel l5=new JLabel("< PENARIKAN TUNAI");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(10, 435, 460, 50);
        JLabel tf=new JLabel("< TRANSFER ");
        tf.setFont(new Font(tf.getName(), Font.PLAIN, 40));
        tf.setBounds(10, 515, 460, 50);
        tf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame3 frame3=new Frame3();
                setVisible(false);
                frame3.setVisible(true);
                
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
        JLabel l7=new JLabel("< VOUCHER ISI ULANG ");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 40));
        l7.setBounds(10, 600, 460, 50);
        JLabel l8=new JLabel("PEMBAYARAN > ");
        l8.setFont(new Font(l8.getName(), Font.PLAIN, 40));
        l8.setBounds(600, 355, 460, 50);
        JLabel l9=new JLabel("GANTI PIN > ");
        l9.setFont(new Font(l9.getName(), Font.PLAIN, 40));
        l9.setBounds(680, 435, 460, 50);
        JLabel l10=new JLabel("FLASH > ");
        l10.setFont(new Font(l10.getName(), Font.PLAIN, 40));
        l10.setBounds(750, 515, 460, 50);
        JLabel l11=new JLabel("PEMBELIAN > ");
        l11.setFont(new Font(l11.getName(), Font.PLAIN, 40));
        l11.setBounds(650, 600, 460, 50);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(tf);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
    
}
