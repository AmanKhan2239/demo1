
 class A {
	 void meth(int a){
		 System.out.println(a);
	 }
 }
class B extends A {
	void meth1 (int a){
		System.out.println( a);
	}
}
public class overriding{
public static void main(String[] args) {
	 B obj = new B();
	 obj.meth(10);
	 obj.meth1(20);
}
}
 
