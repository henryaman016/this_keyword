package p1;

public class D {
static int x=10;
public static void main(String[] args) {
	D d1=new D();
	d1.test1();
}
public void test1() {
	this.test2();
}public void test2() {
	System.out.println(x);
}
}
