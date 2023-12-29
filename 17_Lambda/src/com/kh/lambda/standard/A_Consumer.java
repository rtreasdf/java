package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class A_Consumer {
	/*
	 * Consumer -Consumer 함수적 인터페이스는 리턴 값이 없는 accept() 추상 메소드를 가지고 있다. - accept() 추상
	 * 메소드는 매개값을 소비하는 역할을 한다.
	 */

	public void method1() {
		
		
		Consumer<String> consumer;

		consumer = (str) -> System.out.println(str);

		consumer.accept("Consumer는 한 개의 매개값을 받아서 소비한다.");

		
		
		
		BiConsumer<String, String> biConsumer;

		biConsumer = (str1, str2) -> System.err.println(str1 + str2);

		biConsumer.accept("BiConsumer는", "두 개의 매개값을 받아서 소비한다.");

		
		
		
		DoubleConsumer dConsumer;

		dConsumer = (double value) -> {
			System.out.println(value);
		};

		dConsumer.accept(3.141592);

		
		
		
		ObjIntConsumer<String> ObjIntConsumer;

		ObjIntConsumer = (String str, int value) -> {
			System.out.println(str + value);
		};
		
		ObjIntConsumer.accept("Java", 11);

	}

}
