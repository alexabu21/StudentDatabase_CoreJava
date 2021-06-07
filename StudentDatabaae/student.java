package StudentDatabaae;

import java.util.Scanner;

public class student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private int StudentId;
	private String courses;
	private int tuitionBalance;
	private int payment;
	private static int costOfCourse=600;
	private static int id=1000;


	public student() {
		Scanner  as = new Scanner(System.in);
		System.out.println("Enter your firstname: ");
		this.firstName = as.nextLine();
		
		System.out.println("Enter your LastName: ");
		this.lastName = as.nextLine();
		
		System.out.println(" 1 - ffresherman\n 2 - junior\n 3 - senior \n Enter ur grade level: ");
		this.gradeYear= as.nextInt();
		
		setStudentId();
		System.out.println(firstName +" "+lastName+" "+gradeYear);
			
	}
	
	public void setStudentId(){
		id++;
		this.StudentId=gradeYear+id;
	}
	
	public void enroll() {
		do {
			Scanner as = new Scanner(System.in);
			System.out.println("Enter the course or enter Q to quit");
			String course = as.nextLine();
			if(!course.equals("Q")) {
				this.courses = courses+" "+course;
				this.tuitionBalance = costOfCourse +tuitionBalance;
			}
			else {
				System.out.println("Break");
				break;
				
			}
		}while(1!=0);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("your balance:$"+ tuitionBalance);
	}
	
	public void payTuition() {
		Scanner as = new Scanner(System.in);
		System.out.print("your payment: $" );
		payment = as.nextInt();
		tuitionBalance = tuitionBalance-payment;
		System.out.println("Thank you for the payment: $"+payment);
		viewBalance();
	}
	
	public String showInfo(){
		return "Student Name :" +firstName+ " "+lastName + "\n"
				+ "Enrolled courses: "+ courses;
	}
}









