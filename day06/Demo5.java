class Demo5 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Rectangle r = new Rectangle(10, 10);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
	}
}

class Rectangle {
	private int width;   // 定义宽
	private int height;  // 定义高

	public Rectangle() {}  // 定义空参 空参不需要返回类型

	public Rectangle(int width, int height) {  // 定义有参 不需要返回类型
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {  // 设置宽度
		this.width = width;
	}

	public int getWidth() {  // 获取宽度
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
