package p1;

public class C {
static int x=20;
public static void main(String[] args) {
	C c1=new C();
	System.out.println(x);
	c1.test();
}public void test() {
	System.out.println(x);
}
}
