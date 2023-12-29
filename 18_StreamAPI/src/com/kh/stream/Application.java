package com.kh.stream;

import com.kh.stream.practice.A_Create;
import com.kh.stream.practice.B_Filtering;
import com.kh.stream.practice.C_Sorted;
import com.kh.stream.practice.D_Mapping;
import com.kh.stream.practice.E_Looping;

public class Application {
	
	/*
	 * Stream API
	 * - 컬렉션(배열)의 요소들을 하나씩 참조해서 람다식으로 
	 * 	 처리할 수 있도록 해주는 반복자이다.
	 * - 스트림은 Iterator와 비슷한 역할을 하지만 람다식으로 
	 * 	 요소들의 처리 코드를 제공할 수 있고 내부 반복자를 사용해서 
	 * 	 병렬 처리, 중간 처리, 최종 처리 작업을 수행할 수 있다.
	 * 
	 */

	public static void main(String[] args) {
		
		A_Create a_Create = new A_Create();
		
//		a_Create.method1();
//		a_Create.method2();
//		a_Create.method3();
		
		B_Filtering b_Filtering = new B_Filtering();
		
//		b_Filtering.method1();
//		b_Filtering.method2();
		
		C_Sorted c_Sorted = new C_Sorted();
		
//		c_Sorted.method();
//		c_Sorted.metdhod1();
		
		
		D_Mapping d_Mapping = new D_Mapping();
		
//		d_Mapping.method1();
//		d_Mapping.method2();
//		d_Mapping.method3();
		
		E_Looping e_Looping = new E_Looping();
		
		e_Looping.method1();
		
	}
	
	

}
