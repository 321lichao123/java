/*
	为什么要有包
		将字节码(.class)进行分类存放
		包其实就是文件夹
	包的概述
	
	定义包的格式
		package 包名
		多级包用.分开即可
	定义包的注意事项
		package语句必须是程序的第一条可执行的代码
		package语句在一个java文件中只能有一个
		如果没有package，默认表示包无名
	如何编译运行带包的类
		生成java包指令
			javac -d . Demo1.java
		执行类文件指令
			java com.heima.Demo1
	可以使用import导入包，其实就是让有包的类对调用者可见，不用写全类名
	导包格式
		import 包名
		注意：
			这种方法导入是到类的名称
			虽然可以最后写*,danshi bujianyi 
		package,import,class有没有顺序关系
			有。显示package --> import --> class
	四种权限修饰符
					本类   同一个包下(子类和无关类)  不同包下(子类)  不同包下(无关类)
		private		 Y
		默认		 Y			Y
		protected	 Y			Y							Y
		public		 Y			Y							Y				Y
	面向对象常见修饰符
		修饰符
			权限修饰符：private 默认 protected public
			状态修饰符：static final
			抽象修饰符：abstract
		类
			权限修饰符：默认修饰符， public
			状态修饰符：final
			抽象修饰符：abstract

			用的最多的是public

		成员变量：
			权限修饰符：private 默认 protected public
			状态修饰符：static final
			
			用的最多的是public
		
		构造方法：
			权限修饰符：private 默认 protected public
			
			用的最多的是public

		成员方法：
			权限修饰符：private 默认 protected public
			状态修饰符：static， final
			抽象修饰符：abstract

			用的最多的是 public
		
		组合规则：
			成员变量：public static final
			成员方法
				public static
				public abstract
				public final

*/
package com.heima;
import com.baidu.Person;
class Demo1 {
	public static void main(String[] args) {
		Person p = new Person("张三", 18);
		System.out.println(p.getName() + "..." + p.getAge());
	}
}
