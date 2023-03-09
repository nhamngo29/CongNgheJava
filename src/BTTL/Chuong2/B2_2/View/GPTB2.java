/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTL.Chuong2.B2_2.View;

import BTTL.Chuong2.B2_2.Controller.GPTB2Controler;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Nham Ngo
 */
public class GPTB2 extends JFrame {
    public JTextField txtA,txtB,txtC,txtResult;
    public JButton btnGiai,btnXoa,btnThoat;
    public GPTB2() {
        init();
        this.setVisible(true);
    }
    private void init()
    {
        
        this.setSize(400,300);
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop=new JPanel();
        JLabel lblTitle=new JLabel("Giải phương trình bậc 2");
        Font ft=new Font("Arial",Font.BOLD,25);
        lblTitle.setFont(ft);
        lblTitle.setForeground(Color.red);
        pnTop.setBackground(Color.GRAY);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(lblTitle);
        con.add(pnTop,BorderLayout.NORTH);
        JPanel pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        con.add(pnCenter,BorderLayout.CENTER);
        JPanel pnA=new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        Font ftLable=new Font("Arial",Font.BOLD,14);
        JLabel lblA=new JLabel("A:");
        lblA.setFont(ftLable);
        txtA=new JTextField(20);
        pnA.add(lblA);
        pnA.add(txtA);
        pnCenter.add(pnA);
        JPanel pnB=new JPanel();
        pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB=new JLabel("B:");
        lblB.setFont(ftLable);
        txtB=new JTextField(20);
        pnB.add(lblB);
        pnB.add(txtB);
        pnCenter.add(pnB);
        JPanel pnC=new JPanel();
        pnC.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblC=new JLabel("C:");
        lblC.setFont(ftLable);
        txtC=new JTextField(20);
        pnC.add(lblC);
        pnC.add(txtC);
        pnCenter.add(pnC);
        //Panle ket qua
        JPanel pnKQ=new JPanel();
        pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ=new JLabel("Kết quả");
        lblKQ.setFont(ftLable);
        pnKQ.add(lblKQ);
        pnCenter.add(pnKQ);
        JPanel pnOutPut=new JPanel();
        txtResult=new JTextField(20);
        txtResult.setEnabled(false);
        txtResult.setHorizontalAlignment(SwingConstants.CENTER);
        pnOutPut.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnOutPut.add(txtResult);
        pnCenter.add(pnOutPut);
        //Tạo đường viền và nhập avc
        TitledBorder borderCenter=new TitledBorder(BorderFactory.createLineBorder(Color.red),"Nhập a,b,c");
        pnCenter.setBorder(borderCenter);
        JPanel pnBot=new JPanel();
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        btnGiai=new JButton("Giải");
        
        btnXoa=new JButton("Xóa");
        
        btnThoat=new JButton("Thoát");
        
        ActionListener acl=new GPTB2Controler(this);
        btnGiai.addActionListener(acl);
        btnXoa.addActionListener(acl);
        btnXoa.addActionListener(acl);
        pnBot.add(btnGiai);
        pnBot.add(btnXoa);
        pnBot.add(btnThoat);
        TitledBorder borderBot=new TitledBorder(BorderFactory.createLineBorder(Color.red),"Chọn thao tác");
        pnBot.setBorder(borderBot);
        con.add(pnBot,BorderLayout.SOUTH);
        //set nút thoat
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
