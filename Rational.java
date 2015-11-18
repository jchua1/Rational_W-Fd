public class Rational {

    private double num, denom;

    public Rational() {
	num = 0;
	denom = 1;
    }

    public Rational(double x, double y) {
	if (y = 0) {
	    System.out.println("You cannot have a denominator of 0.");
	    this();
	}
	else {
	    num = x;
	    denom = y;
	}
    }

    public String toString() {
	String retStr = "";
	retStr += num + "/" + denom;
    }

    public float floatValue() {
	//implementation here
    }

    public void multiply(Rational x) {
	//implementation here
    }

    public void divide(Rational x) {
	//implementation here
    }
}
