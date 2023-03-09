/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTL.Chuong2.B2_1.View;

import BTTL.Chuong2.B2_1.Model.PTB1_Model;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nham Ngo
 */
public class PTB1 extends JFrame {
    private PTB1_Model ptb1;
    public JTextField tfA,tfb;
    public Button btnGiai,btnXoa,btnThoat;

    public PTB1() {
        ptb1=new PTB1_Model();
        Init();
        this.setVisible(true);
    }
    public void Init()
    {
        
        tfA=new JTextField();
       
        tfb=new JTextField();
        btnGiai=new Button();
        btnXoa=new Button();
        btnThoat=new Button();
        this.setTitle("Chường trình giải phương trình bậc 1");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font fontTile=new Font("Time new roman",Font.BOLD,30);
        JLabel lbTitle=new JLabel("Giải phương trình bậc 1",JLabel.CENTER);
        lbTitle.setFont(fontTile);
        lbTitle.setForeground(Color.BLUE);
        JPanel jPanel_center=new JPanel();
        jPanel_center.setLayout(new GridLayout(2, 2, 0, 0 ));
        JLabel lbA=new JLabel("Hệ số a:");
        jPanel_center.add(lbA);
        jPanel_center.add(tfA);
        JLabel lbB=new JLabel("Hệ số b:");
        jPanel_center.add(lbB);
        jPanel_center.add(tfb);
        this.setLayout(new BorderLayout());
        this.add(lbTitle,BorderLayout.NORTH);
        this.add(jPanel_center,BorderLayout.CENTER);
        
    }
    
}
