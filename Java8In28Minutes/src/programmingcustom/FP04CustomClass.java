package programmingcustom;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.tools.javac.util.List;

class Course {
	
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getReviewScore() {
		return reviewScore;
	}
	
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	
	public int getNoOfStudents() {
		return noOfStudents;
	}
	
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

	
	
}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring","Framework",98,20000),
				new Course("Spring Boot","Framework",95,18000),
				new Course("API","MicroServices",97,22000),
				new Course("MicroServices","MicroServices",96,25000),
				new Course("FullStack","FullStack",91,14000),
				new Course("AWS","Cloud",92,21000),
				new Course("Azure","Cloud",99,21000),
				new Course("Docker","Cloud",92,20000),
				new Course("Kubernetes","Cloud",91,20000)
				);
		
		//allMatch, noneMatch, anyMatch
		
		Predicate<Course> reviewScoreGreatherThan95 = course ->course.getReviewScore()>95;
		
		Predicate<Course> reviewScoreGreatherThan90 = course ->course.getReviewScore()>90;
		
		Predicate<Course> reviewScorelessThan90 = course ->course.getReviewScore()<90;
		
		
		System.out.println(
				courses.stream().allMatch(reviewScoreGreatherThan95));
		
		System.out.println(
				courses.stream().allMatch(reviewScoreGreatherThan90));
		
		System.out.println(
				courses.stream().noneMatch(reviewScorelessThan90));
		
		System.out.println(
				courses.stream().anyMatch(reviewScoreGreatherThan90));
		
		Comparator<Course> comparingByNoOfStudents = 
				Comparator.comparing(Course::getNoOfStudents);
		
		Comparator<Course> comparingByNoOfStudentsDecreasing = 
				Comparator.comparing(Course::getNoOfStudents).reversed();
		
		Comparator<Course> comparingByNoOfStudentsAndReviewScore = 
				Comparator.comparingInt(Course::getNoOfStudents).
				thenComparingInt(Course::getReviewScore)
				.reversed();
		
		
		
		System.out.println(
		courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList()));
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsAndReviewScore).limit(5).collect(Collectors.toList()));
				
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsAndReviewScore).skip(3).collect(Collectors.toList()));
		
		//takewhile
		System.out.println(
				courses.stream()
						.takeWhile(course ->course.getReviewScore()>=95)
						.collect(Collectors.toList())
				
				);
		
		//dropwhile
		System.out.println(
				courses.stream()
						.dropWhile(course ->course.getReviewScore()>=95)
						.collect(Collectors.toList())
				
				);
		
		System.out.println(
		courses.stream()
		        .max(comparingByNoOfStudentsAndReviewScore));
		
		System.out.println(
				courses.stream()
				        .min(comparingByNoOfStudentsAndReviewScore));
		
		System.out.println(
				courses.stream()
				        .filter(reviewScoreGreatherThan95)
				        .mapToInt(Course::getNoOfStudents)
				        .sum());
		
		System.out.println(
				courses.stream()
				        .filter(reviewScoreGreatherThan95)
				        .mapToInt(Course::getNoOfStudents)
				        .average());
		
		System.out.println(
				courses.stream()
				        .filter(reviewScoreGreatherThan95)
				        .mapToInt(Course::getNoOfStudents)
				        .count());
		
		System.out.println(
				courses.stream()
					.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
				);
		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
