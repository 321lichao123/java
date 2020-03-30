class Demo5 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Rectangle r = new Rectangle(10, 10);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
	}
}

class Rectangle {
	private int width;   // �����
	private int height;  // �����

	public Rectangle() {}  // ����ղ� �ղβ���Ҫ��������

	public Rectangle(int width, int height) {  // �����в� ����Ҫ��������
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {  // ���ÿ��
		this.width = width;
	}

	public int getWidth() {  // ��ȡ���
		return width;
	}

	public void setHeigth(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return 2 * (width + height);
	}

	public int getArea() {
		return width * height;
	}
}
