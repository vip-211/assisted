import java.util.Scanner;
class Clac 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		
		while (true)
		{
		
			System.out.print("Enter the first Value :");
			int first = sc.nextInt();

			System.out.print("Enter the second value :");
			int second = sc.nextInt();

			System.out.println("Selcet Which operation You want to perform: \n 1.ADD  \n 2.Subtraction \n 3.Division  \n 4.Multiplication \n 5.Exit ");
			int sign = sc.nextInt();
			double Total;

		

		if (sign == 1)
			{		
				Total = first + second;
				System.out.println("The addition of two number is :" + Total);

			}

		else if (sign == 2)
			{
				Total = first - second;
				System.out.println("The Subtraction of two number is :" + Total);

			}


		else if (sign == 3)
			{
				Total = (first/second);
				System.out.println("The Disvision of two number is :" + Total);

			}

		else if (sign == 4)
			{
		
				Total = first * second;
				System.out.println("The Multiplication of two number is :" + Total);


			}
		else if (sign == 5)
			{
				System.out.println("Thank You.....");
				break;
			}
			
		}

	}
}
