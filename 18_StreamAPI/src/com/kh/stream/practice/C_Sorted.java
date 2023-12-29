package com.kh.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C_Sorted {

	/*
	 * 정렬 - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬해서 최종 처리 순서를 변경할 수 있다. -
	 * IntStream, LongStream, DoubleStream은 요소들을 오름차순으로 정렬한다. - Stream<T>은 요소 객체가
	 * Comparable 인터페이스를 구현해야 정렬할 수 있다. (구현하지 않으면 예외가 발생한다.)
	 */

	public void method() {

//		Student s1 = new Student("홍길동",25);
//		Student s2 = new Student("이몽룡",20);
//		
//		System.out.println(s1.compareTo(s2));

		List<Student> students = Arrays.asList(new Student("홍길동", 25), new Student("이몽룡", 20),
				new Student("홍길동", 23, "여자", 80, 80));

//	students.stream()
//					.sorted()
//					.forEach((Student student)->{
//							System.out.println(student);
//	});
//		students.stream()
////	      .sorted() //오름차순
//				.sorted(((s1, s2) -> s2.getAge() - s1.getAge()))// 내림차순
//				.forEach(System.out::println);

		students.stream()
//	      .sorted() //오름차순
//				.sorted(((s1, s2) -> s2.getAge() - s1.getAge()))// 내림차순
//				 .sorted(Comparator.naturalOrder())
				.sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	public void metdhod1() {

//		int[] array = new int[5]; 
		int[] array;

		array = new int[] { 3, 5, 1, 4, 2 };
		
		//오름차순으로 정렬
		
		Arrays.stream(array).sorted().forEach(value -> System.out.print(value+ " "));

		
		//내림차순으로 정렬 
		
		System.out.println();
		
		Arrays.stream(array)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.forEach(value ->System.out.print(value +" "));
		
	}

}





























