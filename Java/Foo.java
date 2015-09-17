public class Foo {
	Integer i;
	int j;

public void go() {
	j=i;
System.out.println(i);
System.out.println(j);
}
public static void main(String[] args)
{
	new Foo().go();
}
}