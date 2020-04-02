package com.heima.warpClass;

public class Demo5_Integer {

	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);			// false
		System.out.println(i1.equals(i2));		// true
		
		System.out.println("-------------------");
		
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);			// false
		System.out.println(i3.equals(i4));		// true
		
		System.out.println("-------------------");
		
		Integer i5 = 97;
		Integer i6 = 97;
		System.out.println(i5 == i6);			// true
		System.out.println(i5.equals(i6));		// true
		
		System.out.println("-------------------");
		
		Integer i7 = 197;
		Integer i8 = 197;
		System.out.println(i7 == i8);			// false
		System.out.println(i7.equals(i8));		// true
		
		System.out.println("-------------------");
		
		Integer i9 = 127;
		Integer i10 = 127;
		System.out.println(i9 == i10);			// false
		System.out.println(i9.equals(i10));		// true
		
		System.out.println("-------------------");
		
		Integer i11 = 128;
		Integer i12 = 128;
		System.out.println(i11 == i12);			// false
		System.out.println(i11.equals(i12));		// true
		
		// -128到127是byte的取值范围，如果在这个取值范围内自动装箱就不会新创建对象，而是从常量池中获取，如果超过了byte的范围就会在创建新对象
	}

}
