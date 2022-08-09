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
public class Frame5 extends JFrame{
    Frame4 frame4=new Frame4();
    private String duitt;
    public Frame5(){
        JLabel l1=new JLabel("NO. VA              :"+ frame4.virtualaccount());
        l1.setFont(new Font(l1.getName(), Font.PLAIN, 40));
        l1.setBounds(10, 30, 900, 50);
        
        JLabel l2=new JLabel("NAMA                :");
        l2.setFont(new Font(l2.getName(), Font.PLAIN, 40));
        l2.setBounds(10, 90, 350, 50);
        
        JLabel l3=new JLabel("PERUSAHAAN :");
        l3.setFont(new Font(l3.getName(), Font.PLAIN, 40));
        l3.setBounds(10, 150, 350, 50);
        
        
        JLabel l4=new JLabel("INDRA PRAJA ");
        l4.setFont(new Font(l4.getName(), Font.PLAIN, 40));
        l4.setBounds(330, 90, 460, 50);
        
        JLabel l5=new JLabel("GO-PAY CUSTOMER ");
        l5.setFont(new Font(l5.getName(), Font.PLAIN, 40));
        l5.setBounds(330, 150, 460, 50);
        
        JLabel l6=new JLabel("SILAKAN MASUKKAN JUMLAH TRANSFER ");
        l6.setFont(new Font(l6.getName(), Font.PLAIN, 40));
        l6.setBounds(50, 350, 920, 50);
        
        JLabel l7=new JLabel("RP.  ");
        l7.setFont(new Font(l7.getName(), Font.PLAIN, 40));
        l7.setBounds(250, 400, 100, 50);
        
        JTextField duit=new JTextField();
        duit.setFont(new Font(duit.getName(), Font.PLAIN, 40));
        duit.setBounds(350, 400, 460, 50);
        duit.setBackground(Color.getColor("eeeeee"));
        duit.setBorder(null);
        duitt=duit.getText();
       

        
        
        
        JLabel benar=new JLabel("BENAR > ");
        benar.setFont(new Font(benar.getName(), Font.PLAIN, 40));
        benar.setBounds(730, 520, 460, 50);
        benar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Frame6 frame6=new Frame6();
                setVisible(false);
                frame6.setVisible(true);
                
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
        
        JLabel l9=new JLabel("SALAH > ");
        l9.setFont(new Font(l9.getName(), Font.PLAIN, 40));
        l9.setBounds(735, 620, 460, 50);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(duit);
        add(benar);
        add(l9);
        
        setLayout(null);
        setSize(920, 700);
        setUndecorated(true);
    }
    public String money(){
    return duitt;
    }

}
