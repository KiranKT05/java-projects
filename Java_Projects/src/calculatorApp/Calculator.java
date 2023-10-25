package calculatorApp;

import java.util.Scanner;

public class Calculator 
{
	private Float a,b,c;
	private int ch;
	public Calculator()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		this.a = in.nextFloat();
		System.out.println("Enter number 2 : ");
		this.b = in.nextFloat();
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division\nEnter Your choice");
		this.ch = in.nextInt();
		switch (ch)
		{
			case 1: add();
				break;
			case 2: sub();
				break;
			case 3: mul();
				break;
			case 4: div();
				break;
			default: System.out.println("Please enter valid choice!");
				break;
		}
	}
	public void add()
	{
		c=a+b;
		System.out.println("Addition of given numbers : " +c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction of given numbers : " +c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println("Multiplication of given numbers : " +c);
	}
	public void div()
	{
		c=a/b;
		System.out.println("Division of given numbers : " +c);
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
	}

}
