package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException{			
			while(true) {
				Thread.sleep(1000);			
				int x=(int) (Math.random()*100%100);
				int y=(int) (Math.random()*100%100);
				System.out.println("R的二维坐标"+"("+x+","+y+")");
			}									
	}
}

