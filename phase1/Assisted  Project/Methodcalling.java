public class Methodcalling {

public int multipynumbers(int a,int b) {
	int result =a*b;
	return result;
}

public static void main(String[] args) {

	Methodcalling b=new Methodcalling();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}
}
