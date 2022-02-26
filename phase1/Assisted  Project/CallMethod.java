public class CallMethod {

int a=112;

int operation(int a) {
	a =a*10/100;
	return(a);
}

public static void main(String args[]) {
	CallMethod call = new CallMethod();
	System.out.println("Before operation value of data is "+call.a);
	call.operation(100);
	System.out.println("After operation value of data is "+call.a);
	}
}

