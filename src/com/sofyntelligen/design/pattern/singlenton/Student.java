package com.sofyntelligen.design.pattern.singlenton;

public class Student {

	private String name;
	private String lastname;
	private String faculty;

	private static Student student;

	private Student(String name, String lastname, String faculty) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.faculty = faculty;

		System.out.println("Mi Object es: " + this.toString());
	}

	public static Student getSingletonInstance(String name, String lastname, String faculty) {

		if (student == null) {
			student = new Student(name, lastname, faculty);
		} else {
			System.err.println("No se puede crear el object.");
		}

		return student;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public Student clone() {

		try {
			throw new CloneNotSupportedException();
		} catch (CloneNotSupportedException ex) {
			System.err.println("No se pude clonar el Objecto");
		}

		return null;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", faculty=" + faculty + "]";
	}

}
