class Demo6 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		// Inter i = new Inter();
		Inter i = new Demo();
		i.print();
		i.cat();
	}
}

/*
	�ӿڶ��壺
		����ĽǶȾ���java�е�interface
		����ĽǶ��Ƕ����ṩ����Ķ��ǽӿ�
	�ӿڵ��ص㣺
		ʹ�ùؼ���interface��ʾ
			interface �ӿ��� {}
		����ʵ����implements��ʾ
			class ���� implements �ӿ��� {}
		�ӿڲ���ʵ����
			���ն�̬�ķ���ʵ����
		�ӿڵ�����
			�����ǳ��󡣵����岻��
			�����Ǿ���ġ�Ҫ��д�ӿ��е����г��󷽷�
*/
/*
	�ӿڵĳ�Ա����
		ֻ���ǳ����������Ǿ�̬�Ĳ����⹫����
		Ĭ�����η���public static final ����û��˳��֮��
		�����ֶ�����
	�ӿڵĹ��췽��
		�ӿ���û�й��췽���ģ���Ȼ�����ͬimplements�̳нӿ��еķ������������಻�Ǽ̳нӿڵģ����Ǽ̳�object��
		���ӿ��Ǹɵ�object�����׵���
	�ӿڷ�����
		ֻ���ǳ��󷽷�
		Ĭ������public abstract���η�
*/

interface Inter {
	public abstract void print();
	public static final int num = 10;
	public abstract void cat();
}

class Demo /* extends Object */ implements Inter { // һ���಻д�̳���ôĬ�ϼ̳�object��
	public void print() {
		System.out.println("�ӿ�ʵ����ͨ����̬");
		System.out.println(num);
	}
	public void cat() {
		System.out.println("�ӿڵķ���ֻ�ܳ���������Ҫ����public���η���д");
	}
}