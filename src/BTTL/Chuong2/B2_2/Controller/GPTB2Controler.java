/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTL.Chuong2.B2_2.Controller;

import BTTL.Chuong2.B2_2.Model.PTB2;
import BTTL.Chuong2.B2_2.View.GPTB2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nham Ngo
 */
public class GPTB2Controler implements ActionListener {
    GPTB2 gptb2;
    PTB2 ptb2;
    
    public GPTB2Controler(GPTB2 gptb2) {
        this.gptb2 = gptb2;
        System.out.println("123");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String erc=e.getActionCommand();
        
        switch (erc) {
            case "Giải":
               ptb2=new PTB2(Double.parseDouble(gptb2.txtA.getText()),Double.parseDouble(gptb2.txtB.getText()),Double.parseDouble(gptb2.txtC.getText()));
               gptb2.txtResult.setText(ptb2.GPTB2());
                break;
            default:
                throw new AssertionError();
        }
    }

    
    
}
