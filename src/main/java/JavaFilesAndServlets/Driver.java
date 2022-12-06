package JavaFilesAndServlets;
//this is a test class that we used for login debugging
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("start");
		//attempting to login
		if(Login.validate("Liz", "pass")==true) {
			//System.out.println("match");
		}
		//if un/pass is wrong
		else System.out.print("wrong");
		
	}

}