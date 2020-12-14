import java.util.Scanner;
public class App {
    public static void main(String [] args){
        int f1 = 1,f2 =1, f = 0,n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n==1||n==2){
            System.out.println(1);
            scanner.close();
        }
        else     if(n>2&&n<=40){
            for (int i = 3;i<=n; i++){
                f = f1 + f2;
                f1 =f2;
                f2 = f;
            }
            System.out.println(f);
            scanner.close();
        }
        else if(n>=40){
            System.out.println("输入值过大！！");
            scanner.close();}
        else
            System.out.println("输入值为负数！！");
        scanner.close();
    }
}
