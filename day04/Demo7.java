import java.util.Scanner;
class Demo7 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		//System.out.println("������ڶ�����");
		//int y = sc.nextInt();
		
		getStar(5, 6);
		
	}
	// ��������
	public static void getStar(int x, int y) {
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}
