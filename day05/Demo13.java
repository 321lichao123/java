
/*
	�����������͵�ֵ���ݣ����ı�ԭֵ����Ϊ���ú�ͻᵯջ���ֲ�������֮��ʧ
	�����������͵�ֻ���ݣ��ı�ԭֵ����Ϊ��ʹ������ջ���������ڴ�������󻹴��ڣ�����ͨ����ַ��������

	Java�е����Ǵ�ֵ���Ǵ�ַ
	1�����Ǵ�ֵҲ�Ǵ�ַ���������������Ǵ�ֵ�����������Ǵ�ַ
	2��java��ֻ�д�ֵ����Ϊ��ֵַҲ��ֵ��java֮��֧�֣�
*/ 
class Demo13 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ",b = " + b);
		change(a, b);
		System.out.println("a = " + a + ",b = " + b);

		int[] arr = {1, 2, 3, 4, 5};
		change(arr);
		System.out.println(arr[1]);
	}
	public static void change(int a, int b) {
		System.out.println("a = " + a + ",b = " + b);
		a = b;
		b = a + b;
		System.out.println("a = " + a + ",b = " + b);
	}
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0){
				arr[i] *= 2;
			}
		}
	}
}
