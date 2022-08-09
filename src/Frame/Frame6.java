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
public class Frame6 extends JFrame{
    
    Frame4 frame4=new Frame4();
    Frame5 frame5=new Frame5();

    public Frame6(){
        JLabel l1=new JLabel("NO. VA                        : "+frame4.virtualaccount());
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(10, 30, 900, 50);
        
        JLabel l2=new JLabel("NAMA                          :");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(10, 90, 430, 50);
        
        JLabel l3=new JLabel("PERUSAHAAN           :");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 40));
        l3.setBounds(10, 150, 450, 50);
        
        JLabel l4=new JLabel("INDRA PRAJA ");
        l4.setFont(new Font(l4.getName(), Font.PLAIN, 40));
        l4.setBounds(425, 90, 460, 50);
        
        JLabel l5=new JLabel("GO-PAY CUSTOMER ");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(425, 150, 460, 50);
        
        JLabel l6=new JLabel("JUMLAH TRANSFER : Rp.              "+frame5.money());
        l6.setFont(new Font(l6.getName(), Font.PLAIN, 40));
        l6.setBounds(10, 210, 900, 50);
        
        JLabel l7=new JLabel("BIAYA ADMIN             : Rp.              1000");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 40));
        l7.setBounds(10, 270, 900, 50);
        
        JLabel l8=new JLabel("TOTAL                         : Rp.      "+frame5.money()+1000);
        l8.setFont(new Font(l8.getName(), Font.PLAIN, 40));
        l8.setBounds(10, 330, 900, 50);
        
        JLabel l9=new JLabel("APAKAH ANDA INGIN MEMBAYAR?");
        l9.setFont(new Font(l9.getName(), Font.PLAIN, 40));
        l9.setBounds(100, 420, 920, 50);
        
        JLabel ya=new JLabel("YA > ");
        ya.setFont(new Font(ya.getName(), Font.PLAIN, 40));
        ya.setBounds(800, 520, 460, 50);
        ya.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame7 frame7=new Frame7();
                setVisible(false);
                frame7.setVisible(true);
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
        
        JLabel l10=new JLabel("TIDAK > ");
        l10.setFont(new Font(l10.getName(), Font.PLAIN, 40));
        l10.setBounds(735, 620, 460, 50);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(ya);
        add(l10);
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
}
