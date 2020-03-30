import java.util.Scanner; // 引入键盘录入组件
class Demo9 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);  // 创建键盘录入的方法
		System.out.println("请输入对应星期范围1~7：");
		int week = sc.nextInt();   // 获取键盘录入的值
		System.out.println(getWeek(week));
	}

	// 获取星期
	public static String getWeek(int week){
		String[] arr = {"","一", "二", "三", "四", "五", "六", "日"};
		return arr[week];
	}
}
