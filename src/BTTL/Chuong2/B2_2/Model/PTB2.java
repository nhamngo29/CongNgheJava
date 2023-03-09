/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTL.Chuong2.B2_2.Model;

/**
 *
 * @author Nham Ngo
 */
public class PTB2 {
    double a,b,c;
    String result;

    public PTB2() {
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public String getResult() {
        return result;
    }

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String GPTB2()
    {
        double x1,x2;
        double deta=b*b-4*a*c;
        if (deta>0) {
            x1=(double)((-b+Math.sqrt(deta))/(2*a));
            x2=(double)((-b-Math.sqrt(deta))/(2*a));
            return "X1 = "+x1+" || X2 = "+x2;
        }
        else if(deta==0)
        {
            x1=(-b/(2*a));
            return "X1 = X2 "+x1;
        }
        else
            return "Phương trình vô nghiệm";
    }
}
