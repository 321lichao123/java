class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		/*int x = 0;
		while(x <= 10) {
			System.out.println(x);
			x++;
		}*/
		/*int sum = 0;
		int x = 1;
		while(x <= 100) {
			sum = sum + x;
			x++;
		}
		System.out.println(sum);*/
		int x = 100;
		int total = 0;
		while(x <= 999) {
			int b = x / 100;
			int s = x /10 % 10;
			int g = x % 10;
			if(b * b * b + s * s *s + g * g * g == x) {
				System.out.print("水仙花数：" + x);
				total++;
			}
			x++;
		}
		System.out.println("水仙花总共有：" + total);
	}
}
