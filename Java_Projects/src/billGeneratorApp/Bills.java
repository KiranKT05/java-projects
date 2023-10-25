package billGeneratorApp;

import java.util.Scanner;

public class Bills 
{
	private int vada = 10;
	private int pav = 2;
	private int tea = 7;
	private int countVada;
	private int countPav;
	private int countTea;
	private int total;
	private int vamt;
	private int tamt;

	public Bills()
	{
		Scanner in = new Scanner(System.in);	
		System.out.print("Vada *  ");
		this.countVada = in.nextInt();
		System.out.print("Pav * ");
		this.countPav = in.nextInt();	
		System.out.print("Tea * ");
		this.countTea = in.nextInt();
		total();
	}

	public void total()
	{
		this.vamt = (countVada * vada) + (countPav * pav);
		this.tamt = countTea * tea;
		total = (countVada * vada) + (countPav * pav) + (countTea * tea);	
		System.out.println("Total bill of Tea is : $" +tamt);
		System.out.println("Total bill of VadaPav is : $" +vamt);
		System.out.println("Total : $" +total);
	}
	
	public static void main(String[] args)
	{
		Bills bil = new Bills();
	}

}
