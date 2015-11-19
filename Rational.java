/*
  Team W-Fd -- Jason Chua, Jiawei Chen
  APCS1 pd9
  HW33 -- Do You Even Add, Bro?
  2015-11-18
*/

public class Rational {

    //instance variables for numerator and denominator
    private int num, denom;

    //default constructor that sets numerator to 0 and denominator to 1
    public Rational() {
	num = 0;
	denom = 1;
    }

    //overloaded constructor that takes two arguments to set numerator and denominator
    //if given denominator is 0, numerator is set to 0 and denominator is set to 1 instead
    public Rational(int x, int y) {
	this();
	if (y == 0) {
	    System.out.println("You cannot have a denominator of 0. Your rational number has automatically been set to 0/1.");
	}
	else {
	    num = x;
	    denom = y;
	}
    }

    //returns numerator and denominator separated by a /
    public String toString() {
	String retStr = "";
	retStr += num + "/" + denom;
	return retStr;
    }

    //returns floating point value of the number by changing numerator to double and then dividing by the denominator
    public double floatValue() {
        return ((double)num / denom);
    }

    //multiplies the numerator and denominator by those of the given Rational
    public void multiply(Rational x) {
        num *= x.num;
	denom *= x.denom;
    }

    //divides the numerator and denominator by those of the given Rational
    public void divide(Rational x) {
        num *= x.denom;
	denom *= x.num;
    }

    //adds the numerator with that of the given Rational after finding common d$
    public void add(Rational x) {
        num = (num * x.denom) + (x.num * denom);
        denom *= x.denom;
    }

    //subtracts the numerator with that of the given Rational after finding com$
    public void subtract(Rational x) {
        num = (num * x.denom) - (x.num * denom);
        denom *= x.denom;
    }


    public static void main(String[] args){
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	System.out.println(r.floatValue());
	System.out.println(s.floatValue());
	r.multiply(s);
	System.out.println(r);
	System.out.println(s);
	System.out.println(r.floatValue());

	Rational t = new Rational();
	Rational u = new Rational(1,0);
	Rational v = new Rational(5,1);
	System.out.println(t);
	System.out.println(u);
	System.out.println(v);
	System.out.println(v.floatValue());
	u.divide(v);
	System.out.println(u);

        Rational a = new Rational(2,5);
        Rational b = new Rational(1,3);
        a.add(b);
        System.out.println(a);

        Rational x = new Rational(2,5);
        Rational y = new Rational(1,3);
        x.subtract(y);
        System.out.println(x);

    }
}
