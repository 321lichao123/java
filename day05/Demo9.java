import java.util.Scanner; // �������¼�����
class Demo9 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);  // ��������¼��ķ���
		System.out.println("�������Ӧ���ڷ�Χ1~7��");
		int week = sc.nextInt();   // ��ȡ����¼���ֵ
		System.out.println(getWeek(week));
	}

	// ��ȡ����
	public static String getWeek(int week){
		String[] arr = {"","һ", "��", "��", "��", "��", "��", "��"};
		return arr[week];
	}
}
