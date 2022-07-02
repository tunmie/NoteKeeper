package com.example.notekeeper

class DataManager {
	val courses = HashMap<String, CourseInfo>()

	val notes = ArrayList<NoteInfo>()

	private fun initializeCourses() {
		var course = CourseInfo("android_with_intents", "Android Programming with Intents")
		courses.set(course.courseId, course)

		course = CourseInfo("android_async", "Android Async Programming and Services")
		courses.set(course.courseId, course)

		course = CourseInfo(courseId = "java_lang", title = "Java Fundamentals: The Java Language")
		courses.set(course.courseId, course)

		course = CourseInfo(title = "Java Fundamentals: The Core Platform", courseId = "java_core")
		courses.set(course.courseId, course)
	}
}
