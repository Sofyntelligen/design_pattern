package com.sofyntelligen.design.pattern.singlenton;

public class TestSinglenton {
	
	public static void main(String... args) {
        
        Student studentA = Student.getSingletonInstance("Daniel", "Osorio", "Facultad de Ingenieria");
        
        System.out.println("################");
        System.out.println(studentA.toString());
        
        Student studentB = Student.getSingletonInstance("Jose", "Hernandez", "Facultad de Ciencias");

        System.out.println("################");
        System.out.println(studentB.toString());   
        
        Student studentAA = Student.getSingletonInstance("Daniel", "Osorio", "Facultad de Ingenieria");
        
        try{
        	Student studentBB = studentAA.clone();
            System.out.println(studentBB.getName());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }

}
