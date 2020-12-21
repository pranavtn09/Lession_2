import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		String email[]=new String[] {"abc@gmail.com","BGDS@gmai.com","xyz@gmail.com"};
		Scanner read=new Scanner(System.in);
		System.out.println("Enter email to be searched:");
		String s=read.next();
		int flag=0;
		for(String e:email) {
			if(e.equals(s)) {
				flag=1;
				break;
			}
				
			}
		if(flag==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
