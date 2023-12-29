package com.kh.lambda.standard;

import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class B_Supplier {

	/*
	 * Supplier - Supplier 함수적 인터페이스는 매개변수가 없고 리턴 값이 있는 get() 추상 메소드를 가지고 있다. -
	 * get() 추상 메소드는 호출한 곳으로 데이터를 리턴(공급)하는 역할을 한다.
	 * 
	 */

	public void method1() {
		Supplier<String> Supplier;

//		Supplier = () -> {
//			return "Supplier는 지정된 타입의 객체를 리턴한다.";
//		};
		Supplier = () -> "Supplier는 지정된 타입의 객체를 리턴한다.";

		System.out.println(Supplier.get());

		BooleanSupplier booleanSupplier;

		booleanSupplier = () -> {
			return true;
		};

		System.out.println(booleanSupplier.getAsBoolean());

		LongSupplier longSupplier;

//		longSupplier = () -> {
//			return 21312412312412421L;
//		};
		longSupplier = () -> 21312412312412421L;
		;

		System.out.println(longSupplier.getAsLong());

	}
}
