package Asign1;

import java.util.Scanner;

public class CreateAcc extends Video {
	
	String birthDay;
	String userName;
	String phoneNum;
	
	
	CreateAcc() {
		System.out.println("Welcome to TikTok!\n");
		System.out.println("Create your own TikTok Account here\n");
		System.out.println("Please enter birthday : ");
		Scanner in = new Scanner(System.in);
		String day = in.next();
			
		this.birthDay = day;
		
		System.out.println("Create your username  :");
		String name = in.next();
		
		this.userName = name;
		
		
		System.out.println("Please enter phone number : ");
		String num = in.next();
		
		this.phoneNum = num;
	}


	public void userName() {
		System.out.println("Your Name Account is " + userName+"\t");
		
		
	}


	public String getbirthDay() {
		return birthDay;
		
	}
	
	public void setBirthday(String mybirthday) {
		this.birthDay = mybirthday;
	}


	public void phoneNum() {
		
		
	}
	
		


}
