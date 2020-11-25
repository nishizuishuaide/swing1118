package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
			System.out.println("java随机坐标生成小程序");			
			Scanner sca=new Scanner(System.in);	
			while(true) {
			System.out.println("请输入1：");
			int num=sca.nextInt();
			if(num==1) {
				int x=(int) (Math.random()*num*100%100);
				int y=(int) (Math.random()*num*100%100);
				System.out.println("R的二维坐标"+"("+x+","+y+")");
			}else {
				System.out.println("程序错误，请输入1");
			}			
		}		
	}
}

