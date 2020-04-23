/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadraticEquation;

/**
 *
 * @author User
 */
public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;
    
    /** A constructor for the arguments for  a, b, and  c
     * @param a.
     * @param b
     * @param c*/
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /** Three getter methods for  a, b, and  c.
     * @return  */
    public double getA() {
        return this.a;
    }
    
    public double getB() {
        return this.b;
    }
    
    public double getC() {
        return this.c;
    }
    
    /** A method named  getDiscriminant()  that returns the discriminant, which is b2 -4ac
     * @return .*/
    public double getDiscriminant() {
        return (Math.pow(b, 2)- (4* a* c));
    }
    
    /** The methods named  getRoot1()  and  getRoot2()  for returning two roots of the equation r1 = (-b + (b^2 - 4* a* c)^1/2)/ (2*a) and r2 = (-b - (b^2 - 4* a* c)^1/2)/ (2*a
     * @return )*/
    public double getRoot1() {
        return this.getDiscriminant() < 0 ? 0: (-b + Math.sqrt(this.getDiscriminant()))/ (2*a);
    }
    
    public double getRoot2() {
        return this.getDiscriminant() < 0 ? 0: (-b - Math.sqrt(this.getDiscriminant()))/ (2*a);
    }
}
