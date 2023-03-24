package workplateform;


import java.util.Random;
import java.util.Scanner;

class Second
{
	public void prepared()
	{
		Random r=new Random();
		Scanner obj = new Scanner(System.in);
		int val=r.nextInt(101);
		System.out.println("A Random Number is generated");
		System.out.println("Enter the number of guesses you want to try.Guesses must be < 9");
		int num=obj.nextInt();
		while(num>9)
		{
			System.out.println("Your chances exceeds. *Please Enter number < 9 *");
			num=obj.nextInt();
		}
		System.out.println("You have"+num+"Chances");
		int fscore=100,k=0;
		for(k=0;k<num;k++)
		{
			
			System.out.println("Enter the number you guessed.Chance no"+(k+1));
			int number=obj.nextInt();
			if(number==val)
			{
				System.out.println("That's Amazing ...You won the Game");
				System.out.println("Your score is "+fscore);
				break;
			}
			else if(number>val)
			{
				System.out.println("Your number is greater than the original number");
			}
			else
			{
				System.out.println("Your number is less than the original number");
			}
			fscore-=10;
		} 
		if(k>=num)
		{
		    System.out.println("Alas!,You Lost the game");
			System.out.println("The number is "+val);
			System.out.println("Your score is: 0");
		}
	}
}
class Hello
{
public static void main(String args[])
{
	System.out.println("Java developer Task-2");
	Scanner obj=new Scanner(System.in);
	Second s=new Second();
	System.out.println("Shall we start the game ? : Yes/No");
	String str=obj.nextLine();
	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
	{
		s.prepared();
		System.out.println("Do you want to proceed ? Yes/No");
		str=obj.nextLine();
	}
	System.out.println("Game ended!!!");
}
}