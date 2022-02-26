
public class TypeCasting {

	public static void main(String[] args) {
		char ch='A';
		int a=ch;
		System.out.println("Impicit type char to int: "+a);
		float b=a;
		System.out.println("Impicit type int to float: "+b);
		double d=b;
		System.out.println("Impicit type float to double: "+d);
		long l=a;
		System.out.println("Impicit type int to long: "+l);
		System.out.println("Explicit type casting");
		float f=50;
		int i=(int)f;
		System.out.println(i);
		double w=50.0;
		float g=(float) w;
		System.out.println(g);


	}
}

