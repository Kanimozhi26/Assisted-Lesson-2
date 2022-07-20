package methods_example;

public class method_callbyvalue {
	double r=100;
	double operation(double r) {
		r =r*r*3.14;
		return(r);
	}
	public static void main(String[] args) {
		method_callbyvalue obj = new method_callbyvalue();
		System.out.println("Before calling "+obj.r);
		obj.operation(200);
		System.out.println("After calling "+obj.r);

	}

}
