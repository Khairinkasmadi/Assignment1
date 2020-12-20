package Asign1;

public class TikTok {
	
	public static void main(String[] args) {
		
		CreateAcc c = new CreateAcc();
		System.out.println("Welcome to TikTok");
		c.getbirthDay();
		c.userName();
		c.phoneNum();	
		System.out.println("Login your account Thank You");
		
		
		Video v = new Video();
		v.genreVideo();
		
		
	}
	
	

}
