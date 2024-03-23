package innerclass;
class Outer{
	int x=5;
	void value() {
		System.out.println(x);
	}
private class Inner{
	int y=5;
}

void getvalue() {
	Inner in=new Inner();
	System.out.println(in.y);
}
}
public class InOut {

	public static void main(String[] args) {
	Outer obj=new Outer();
	obj.getvalue();
	obj.value();
//Outer.Inner obj1=new Outer.Inner();
//System.out.println( obj.x +obj1.y );
}}