
import java.util.Scanner;  // �������¼��ģ��
class GuessNum {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);   // ����¼�����
		int guessNum = (int)(Math.random() * 100) + 1;
		while(true) {
			int result = sc.nextInt();  // ��ȡ����¼�����
			if(result > guessNum) {
				System.out.println("����");
			} else if(result < guessNum) {
				System.out.println("С��");
			} else {
				System.out.println("����");
				break;
			}
		}
	}
}
