class Demo5 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) {
				break;							// �������hello world
				//continue;							// ���7��hello world
				//System.out.println("Hello World!");  // ���15��hello world
			}
			num++;
			System.out.println("Hello World!");
			System.out.println("num = " + num);
		}
	}
}