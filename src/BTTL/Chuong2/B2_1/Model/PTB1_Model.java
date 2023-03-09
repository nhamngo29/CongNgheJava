/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTL.Chuong2.B2_1.Model;

/**
 *
 * @author Nham Ngo
 */
public class PTB1_Model {
    private double a,b,result;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public PTB1_Model(double a, double b, double result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public PTB1_Model() {
    }

    public PTB1_Model(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double GiaiPTB1()
    {
        return -b/a;
    }
}
