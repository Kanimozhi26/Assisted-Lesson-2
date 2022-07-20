package methods_example;

public class methods_demo {
	public int add(int i1,int i2) {
		int a=i1+i2;
		return a;
	}
	public static void main(String[] args) {
		methods_demo obj=new methods_demo();
		int answer= obj.add(100,400);
		System.out.println("Performing Addition i1+i2 = "+answer);


	}

}
