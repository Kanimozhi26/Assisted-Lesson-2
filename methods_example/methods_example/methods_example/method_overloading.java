package methods_example;

public class method_overloading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
    public void area(int l,double b) 
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }
    public void area(double s) 
    {
         System.out.println("Area of Square : "+(4*s));
    }
	public static void main(String[] args) {
		method_overloading obj=new method_overloading();
	       obj.area(10,12);
	       obj.area(5);
	       obj.area(5,10.0); 
	       obj.area(5.0); 
	}

}
