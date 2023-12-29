package com.kh.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_Filtering {

	public void method1() {

		/*
		 * 필터링 - 중간 처리 기능으로 특정 요소를 걸러내는 역할을 한다. - distinct() : 요소의 중복을 제거하는 메소드 -
		 * filter(Predicate) : 매개값으로 전달되는 predicate false를 리턴하는 요소를 제거한다.
		 */
		List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "이몽룡");

		Stream<String> stream = names.stream();

		stream.forEach(name -> System.out.print(name + " "));

		// 이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없다.
//		stream.distinct().forEach(name -> System.out.print(name + " "));

		// 새로운 스트림을 다시 얻어와야한다.
//		names.stream().distinct().forEach(name -> System.out.print(name + " "));

		System.out.println();

		List<Student> students = 
				Arrays.asList(
						new Student("홍길동", 25),
						new Student("이몽룡", 20),
				new Student("성춘향", 20, "여자", 80, 90), new Student("이몽룡", 20));

//		students.stream().distinct()
//		     .forEach((Student student)->{
//			  System.out.println(student);
//		});
		students.stream().distinct().forEach(System.out::println);

	}

	public void method2() {
		List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "이몽룡","이순신");

		
		names.stream()
		.distinct()
//		.filter( name->name.startsWith("이"))
		.filter( name->!name.startsWith("이"))
//		.distinct()
		.forEach(name ->System.out.print(name + " "));
		
		
		
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("홍길동", 25, "남자", 70, 80),
				new Student("이몽룡", 20),
				new Student("성춘향", 20, "여자", 80, 90),
				new Student("이몽룡", 20));
		
		students.stream()
//		.filter(student->student.getGender().equals("여자"))
//		.filter(student->student.getGender().equals("남자"))
		.distinct()
		.filter(student->!student.getGender().equals("여자"))
		.forEach(System.out::println);
		
		
		//수학 점수, 영어 점수가 60점 이상인 학생만 출력
		
		System.out.println();
		
		students.stream()
		.filter((Student student)-> {
			return student.getMateScore() >= 60 && student.getEnglishScore() >=60;
		})
		.forEach((Student student)->{
			System.out.println(student);
		});
	
		
	}

}




























