package com.lavanya.assignment1;

public interface Course {
	public void addCourseSubcriber(Student student);
	public void removeCourseSubcriber(Student student);
	public void notifyCourseSubscribers(String message);
}
