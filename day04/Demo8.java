import java.util.Scanner;
class Demo8 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();

		getTu(x, y);

	}
	// 画9*9表格
	public static void getTu(int x, int y) {
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}
