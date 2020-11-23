package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
			Scanner sca=new Scanner(System.in);	
			while(true) {
			int num=sca.nextInt();
			int x=(int) (Math.random()*num*100);
			int y=(int) (Math.random()*num*100);
			System.out.println("R:"+"x值域"+x+","+"y值域"+y);
		}
		
	}
}
