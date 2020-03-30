/*
	重写的面试题
		Override和Overload的区别？Overload能改变返回值类型吗？
		overload可以修改返回值类型，只看参数列表
		方法重写：
			子类出现和父类中方法声明一模一样的方法，与返回值类型无关，返回值是一致
		方法重载
			子类中出现方法名一样但是参数列表不同，与返回值无关
		子类调用方法的时候：
			先找子类本身，再找父类
*/

class Demo5 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
