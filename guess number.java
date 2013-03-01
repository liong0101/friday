import java.util.Scanner;


public class Ml04 {
  public static void main(String[] args) {
		int jsj,yh;
		Scanner input = new Scanner(System.in);
		jsj=(int)(Math.random()*10);
		while(true){
			System.out.print("请猜一个1-10之间的整数：");
			yh = input.nextInt();
			if(yh>jsj){
				System.out.println("大了");
			} else if(yh==jsj){
				System.out.println("恭喜你，猜对了!");
				break;
			} else{
				System.out.println("小了");
			}
		}
	}
}
