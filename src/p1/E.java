package p1;

public class E {
static int x=10;
public static void main(String[] args) {
	E e1=new E();
	
	e1.test();
}public void test() {
	E.test1();
}
public static void test1() {
	System.out.println(x );
}
}
