package com.tnsif.second;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20; 
        String name = "Manasa";
        double marks = 88.5;
        char grade = 'A';    
        boolean pass = true;  

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + pass);


        age = 21;
        marks = 90.0;

        System.out.println("\nAfter updating variables:");
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Marks: " + marks);

    }
        }