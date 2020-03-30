class Demo2 {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.num);  // 10

		Father f1 = new Son();
		f1.print();

		Father f2 = new Son();
		f2.method();
	}
}
/*
	��Ա����
		���뿴���(����)�����п����(����)
	��Ա����
		���뿴��ߣ����ࣩ�����п��ұߣ����ࣩ ��̬��
	��̬����
		���뿴��ߣ����ࣩ�����п��ұߣ����ࣩ
*/

class Father {
	int num = 10;
	public void print() {
		System.out.println("Father");
	}
	public static void method() {
		System.out.println("Father static method");
	}
}

class Son extends Father {
	int num = 20;
	public void print() {
		System.out.println("Son");
	}
	public static void method() {
		System.out.println("Son static method");
	}
}