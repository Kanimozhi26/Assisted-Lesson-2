package constructors_example;

public class parameterized_constructor {

	int id;
	String name;
	double salary;
	parameterized_constructor(int i, String n, double s){
		id=i;
		name=n;
		salary=s;
	}
	
void display(){
	System.out.println(id+" "+name+" " +salary);
}
	public static void main(String[] args) {
		parameterized_constructor obj= new parameterized_constructor(21,"AAA", 80000);
        obj.display();
	}
}
