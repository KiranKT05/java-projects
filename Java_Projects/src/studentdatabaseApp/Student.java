package studentdatabaseApp;

import java.util.Scanner;

public class Student
{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String course = null;
	private int tutionBalance;
	private static int costOfCourse = 600;	
	private static int id = 1001;
	//constructor : prompt user to enter students name and year
	public Student()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = s.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = s.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = s.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " "+ lastName + " " + gradeYear + studentID);
		
		
	}
	//generate an ID
	private void setStudentID()
	{
		//grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll()
	{
		do {
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner s = new Scanner(System.in);
		String course = s.nextLine();
			if(!course.equals("Q"))
			{
				course = course + "\n " + course;
				tutionBalance = tutionBalance + costOfCourse;
			}else 
				{
					System.out.println("BREAK!");
					break; 
				}
		}while(1!=0);

	}
	
	//view balance
	public void viewBalance()
	{
		System.out.println("Your Balance is : $" +tutionBalance);
	
	}
	
	//pay tuition
	public void payTution()
	{	viewBalance();
		System.out.print("Enter Your payment : $");
		Scanner s = new Scanner(System.in);
		int payment =s.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for the payment of $" +payment);
		viewBalance();
	}
	//show status
	public String showInfo()
	{
		return "Name : " + firstName + " " + lastName +
				"\nGrade Level: "+ gradeYear +
				"\nStudents ID : "+ studentID +
				"\nCourse enrolled : " + course +
				"\nBalance : $" + tutionBalance;
	}
	public static void main(String[] args) 
	{
		//ask how many users we want to add
		System.out.println("Enter new number of students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//create n number of new students 
		for (int n = 0; n< numOfStudents; n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
		}
		for (int n = 0; n< numOfStudents; n++)
		{
			System.out.println(students[n].showInfo());
		}
	}
}
