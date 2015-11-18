public class Rational {

    private int num, denom;

    public Rational() {
	num = 0;
	denom = 1;
    }

    public Rational(int x, int y) {
	this();
	if (y == 0) {
	    System.out.println("You cannot have a denominator of 0.");
	}
	else {
	    num = x;
	    denom = y;
	}
    }

    public String toString() {
	String retStr = "";
	retStr += num + "/" + denom;
	return retStr;
    }

    /*public float floatValue() {
	//implementation here
	}*/

    public void multiply(Rational x) {
        num *= x.num;
	denom *= x.denom;
    }

    public void divide(Rational x) {
        num *= x.denom;
	denom *= x.num;
    }

    public static void main(String[] args){
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	r.multiply(s);
	System.out.println(r);
    }
}
