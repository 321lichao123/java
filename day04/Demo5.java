class Demo5 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) {
				break;							// 输出三次hello world
				//continue;							// 输出7次hello world
				//System.out.println("Hello World!");  // 输出15次hello world
			}
			num++;
			System.out.println("Hello World!");
			System.out.println("num = " + num);
		}
	}
}
