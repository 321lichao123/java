class Demo7 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
	�����࣬����ӿڣ��ӿ���ӿ�֮��Ĺ�ϵ��
		�����ࣺ
			�̳й�ϵ��ֻ�ܵ���̳У����Զ��̳�
		����ӿ�
			ʵ�ֹ�ϵ�����Ե���̳У�Ҳ���Զ��̳�
			���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
		�ӿ���ӿ�
			�̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳�
*/
/*
	�ӿ�������������
		�����ࣺ
			��Ա���������Ա���Ҳ�����ǳ���
			���췽������
			��Ա���������Գ���Ҳ���Էǳ���
		�ӿڣ�
			��Ա������ֻ���ǳ���
			���췽����û��
			��Ա���������Գ���
*/
/*	
	�����������
		������ ���̳������ǣ�"is a"�Ĺ�ϵ�������ඨ����Ǹü̳���ϵ�Ĺ��Թ���
		�ӿ� ��ʵ�������ǣ� "like a"�Ĺ�ϵ���ӿ��ж�����Ǹü̳���ϵ����չ
*/

interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

interface InterC extends InterA, InterB {

}

class Demo extends Object implements InterA, InterB {
	public void printA() {
		System.out.println("�̳нӿ�A");
	}
	public void printB() {
		System.out.println("�̳нӿ�B");
	}
}

