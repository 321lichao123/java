class Demo1 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		/*
			153 = 1*3 + 5*3 + 3*3
			
		*/
		int num = 0;
		for (int i = 100; i <= 999; i++ ){
			int b = i / 10 / 10;
			int s = i / 10 % 10;
			int g = i % 10;
			if( i == ((b*b*b) + (s*s*s) + (g*g*g))){
				num++;
				System.out.println(i);
			}
			
		}
		System.out.println("Ë®ÏÉ»¨Êý£º" + num);
	}
}
