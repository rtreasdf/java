package com.kh.lambda.standard;

public class Student {
	private String name;

	private int age;

	private String gender;

	private int mateScore;

	private int englishScore;

	public Student() {
	}

	public Student(String name, int age) {
		this(name, age, "남자", 30, 30);
	}

	public Student(String name, int age, String gender, int mateScore, int englishScore) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mateScore = mateScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMateScore() {
		return mateScore;
	}

	public void setMateScore(int mateScore) {
		this.mateScore = mateScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", mateScore=" + mateScore
				+ ", englishScore=" + englishScore + "]";
	};
	
	

}
