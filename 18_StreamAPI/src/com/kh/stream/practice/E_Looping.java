package com.kh.stream.practice;

import java.util.Arrays;

public class E_Looping {

	/*
	 * 반복 
	 * 	- 요소 전체를 반복하는 역할을 한다. 
	 * 	- peek()
	 *  	-중간 처리 단계에서 전체 요소를 반복함녀서 추가적인 
	 *  	 작업을 하기 위해 사용한다.
	 *  - forEach()
	 *  	-최종 처리 단계에서 전체 요소를 반복하면서 추가적인 
	 *  	 작업을 하기 위해 사용한다. 
	 */
	
	public void method1() {
		int[] array = {1,2,3,4,5};
		
		Arrays.stream(array)
//		.filter(value->{
//			return value % 2 == 0;
//		})
		.filter(value->{
			return value % 2 == 0;
		})
		.peek(value ->System.out.println(value))
		.sum();
		
		
	}
}
