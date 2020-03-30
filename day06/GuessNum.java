
import java.util.Scanner;  // 导入键盘录入模板
class GuessNum {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);   // 生成录入对象
		int guessNum = (int)(Math.random() * 100) + 1;
		while(true) {
			int result = sc.nextInt();  // 获取键盘录入变量
			if(result > guessNum) {
				System.out.println("大了");
			} else if(result < guessNum) {
				System.out.println("小了");
			} else {
				System.out.println("对了");
				break;
			}
		}
	}
}
