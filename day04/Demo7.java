import java.util.Scanner;
class Demo7 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();
		//System.out.println("请输入第二整数");
		//int y = sc.nextInt();
		
		getStar(5, 6);
		
	}
	// 画出星星
	public static void getStar(int x, int y) {
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}
