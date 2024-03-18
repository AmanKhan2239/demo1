
public class overloading {
	void meth(int a){
		System.out.println(a);
	}
	void meth (int a ,int b){
		System.out.println(a+b);
	}
public static void main(String[] args) {
	overloading obj=new overloading();
	obj.meth(10);
	obj.meth(10, 20);
}
}
