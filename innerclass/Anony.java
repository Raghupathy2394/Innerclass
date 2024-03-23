package innerclass;
class Test {
	void test() {
		System.out.println("science");
	}
}
//class Test1 extends Test
	


public class Anony {

	public static void main(String[] args) {
	  Test obj=new Test()
	  {
			void test() {
				System.out.println("maths");
			}
	  };
			obj.test();

	}}


