//default constructor
	class EmpInfo{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}
	//parameterized constructor
	class Std{
		int sid;
		String sname;

		Std(int s,String sn)
		{
		sid=s;
		sname=sn;
		}

		void displayp() {
		System.out.println(sid+" "+sname);
		}
	}

	public class Constructer {

	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		
		Std std1=new Std(1,"Vivek");
		Std std2=new Std(2,"Harshal");
		std1.displayp();
		std2.displayp();

		}
	}
